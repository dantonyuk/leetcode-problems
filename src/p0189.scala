// https://leetcode.com/problems/rotate-array
object Solution {
  def rotate(nums: Array[Int], k: Int): Unit = {
    def reverse(from: Int, to: Int) =
      for (i <- from to ((to + from) / 2) - 1) {
        val j = to + from - i - 1
        val tmp = nums(i)
        nums(i) = nums(j)
        nums(j) = tmp
      }
    val l = nums.length
    val s = k % l
    reverse(0, l - s)
    reverse(l - s, l)
    reverse(0, l)
  }
}
