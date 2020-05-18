// https://leetcode.com/problems/single-number
object Solution {
  def singleNumber(nums: Array[Int]): Int = {
    nums.reduce(_ ^ _)
  }
}
