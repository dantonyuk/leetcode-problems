// https://leetcode.com/problems/maximum-subarray
object Solution {
  def maxSubArray(nums: Array[Int]): Int = {
    var maxSum = Int.MinValue
    var currentSum = 0
    for (n <- nums) {
      currentSum += n
      if (currentSum > maxSum) {
        maxSum = currentSum
      }
      if (currentSum < 0) {
        currentSum = 0
      }
    }
    maxSum
  }
}
