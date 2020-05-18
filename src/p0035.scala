// https://leetcode.com/problems/search-insert-position
object Solution {
  def searchInsert(nums: Array[Int], target: Int): Int = {
    var left = 0
    var right = nums.length
    var current = (left + right) / 2
    while (current != left && current != right) {
      if (nums(current) < target) {
        left = current
      }
      else {
        right = current
      }
      current = (left + right) / 2
    }
    if (current == 0 && nums(0) >= target) 0 else current + 1
  }
}
