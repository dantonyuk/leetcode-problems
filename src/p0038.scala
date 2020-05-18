// https://leetcode.com/problems/count-and-say
object Solution {
  def groupSame[A](s: Seq[A]) = LazyList.unfold(s) {
    case Seq()  => Option.empty
    case s@(h +: t) =>
      val (l, r) = s span { h == _ }
      Option(((h, l.size), r))
  }

  def countAndSay(n: Int): String = {
    if (n == 1) "1"
    else {
      groupSame(countAndSay(n - 1)).map { case (c, l) => s"$l$c" }.mkString
    }
  }
}
