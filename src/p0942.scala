// https://leetcode.com/problems/di-string-match
object Solution {
  def diStringMatch(S: String): Array[Int] = {
    var hi = S.length
    var lo = 0
    val arr = LazyList.from(S).map(c =>
        if (c == 'I') {
          lo += 1
          lo - 1
        } else {
          hi -= 1
          hi + 1
        }).force :+ lo
    arr.toArray
  }
}
