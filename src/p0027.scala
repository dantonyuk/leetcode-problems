// https://leetcode.com/problems/remove-element
object Solution {
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    var store = 0
    var index = 0
    while (index < nums.length) {
      if (nums(index) != `val`) {
        nums(store) = nums(index)
        store += 1
      }
      index += 1
    }
    store
  }
}
