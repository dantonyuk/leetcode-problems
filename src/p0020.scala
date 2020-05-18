// https://leetcode.com/problems/valid-parentheses
object Solution {
  val parens = Map(')' -> '(', '}' -> '{', ']' -> '[')
  val opens = parens.values.toList

  def isValid(s: String): Boolean = {
    object Open {
      def unapply(c: Char): Option[Char] = opens.find(_ == c)
    }

    object Close {
      def unapply(c: Char): Option[Char] = parens.get(c)
    }

    @scala.annotation.tailrec
    def matches(parens: Seq[Char], stack: List[Char]): Boolean =
      (parens, stack) match {
        case (Seq(), Nil)                 => true
        case (Seq(), _)                   => false
        case (Open(p) +: rest, _)         =>
          matches(rest, p +: stack)
        case (Close(p) +: rest, Nil)      => false
        case (Close(p) +: rest, c :: cs)  =>
          if (c != p) false else matches(rest, cs)
      }

      matches(s, Nil)
  }
}
