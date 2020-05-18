// https://leetcode.com/problems/max-consecutive-ones
object Solution {
  def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
    var maxNum = 0
    var currentNum = 0
    for (n <- nums) {
      if (n == 1) {
        currentNum += 1
        if (currentNum > maxNum) {
          maxNum = currentNum
        }
      }
      else {
        currentNum = 0
      }
    }
    maxNum
  }
}
