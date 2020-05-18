// https://leetcode.com/problems/backspace-string-compare
object Solution {
  case class Index(var i: Int, var bs: Int)

  def backSpace(s: String, ind: Index): Unit = {
    while (ind.i > -1 && s(ind.i) == '#') {
      ind.i -= 1
      ind.bs += 1
    }
    while (ind.i > -1 && s(ind.i) != '#' && ind.bs > 0) {
      ind.i -= 1
      ind.bs -= 1
    }
  }

  def isEmpty(s: String, ind: Index): Boolean = {
    while (true) {
      backSpace(s, ind)
      if (ind.i < 0) return true
      if (s(ind.i) != '#') return false
    }
    throw new IllegalStateException()
  }

  def backspaceCompare(S: String, T: String): Boolean = {
    val si = Index(S.length - 1, 0)
    val ti = Index(T.length - 1, 0)

    while (true) {
      backSpace(S, si)
      backSpace(T, ti)

      (isEmpty(S, si), isEmpty(T, ti)) match {
        case (true, true)  => return true
        case (true, false) => return false
        case (false, true) => return false
        case _             =>
      }
      if (S(si.i) != T(ti.i)) {
        return false;
      }
      si.i -= 1
      ti.i -= 1
    }
    throw new IllegalStateException()
  }
}
