// https://leetcode.com/problems/reverse-integer/
object Solution {
  def reverse(x: Int): Int = {
    if (x == Int.MinValue) return 0
    val xSign = x.sign
    val xAbs = x.abs
    val l = xAbs.toString.reverse.toLong * xSign
    if (l > Int.MaxValue || l < Int.MinValue) return 0
    return l.toInt
  }
}
