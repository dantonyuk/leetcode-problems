sealed trait Match {
  def matchStr(s: String, pos: Int): List[Int]
}

sealed trait SimpleMatch extends Match {
  def matchStr(s: String, pos: Int): List[Int] =
    if (pos < s.size && matchOne(s, pos)) List(pos + 1) else List()

  def matchOne(s: String, pos: Int): Boolean
}

case class Sym(c: Char) extends SimpleMatch {
  def matchOne(s: String, pos: Int): Boolean = s(pos) == c
}

object Dot extends SimpleMatch {
  def matchOne(s: String, pos: Int): Boolean = true
}

case class Star(m: SimpleMatch) extends Match {
  def matchStr(s: String, pos: Int) =
    (pos +: LazyList.from(pos).takeWhile(i => i < s.size && m.matchOne(s, i)).map(_ + 1)).toList
}

object Solution {
  val alphabet = Set.from('a' to 'z')

  def parsePattern(p: String): List[Match] = {
    var i = 0
    var lst = List.empty[Match]
    while (i < p.size) {
      if (p(i) != '.' && !alphabet(p(i))) throw new IllegalStateException("Invalid pattern")
      val m: SimpleMatch = if (p(i) == '.') Dot else Sym(p(i))
      lst = lst :+ (if (i == p.size - 1 || p(i + 1) != '*') m else {
        i += 1
        Star(m)
      })
      i += 1
    }
    return lst
  }

  def interpret(ms: List[Match], s: String): Boolean = {
    var pos = List(0)
    for (m <- ms) {
      pos = pos.flatMap(p => m.matchStr(s, p))
    }
    pos.exists(_ == s.size)
  }

  def isMatch(s: String, p: String): Boolean = {
    val ms = parsePattern(p)
    interpret(ms, s)
  }
}
