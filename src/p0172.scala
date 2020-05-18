// https://leetcode.com/problems/factorial-trailing-zeroes
object Solution {
  def trailingZeroes(n: Int): Int =
    LazyList.iterate(5L)(_ * 5).map(n / _).takeWhile(_ > 0).sum.toInt
}
