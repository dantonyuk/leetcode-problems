// https://leetcode.com/problems/jump-game
object Solution {
  def canJump(nums: Array[Int]): Boolean = {
    var el = nums.length - 1
    while (el > 0) {
      el = (0 to el - 1).find(i => nums(i) + i >= el).getOrElse(-1)
    }
    return el == 0
  }
}
