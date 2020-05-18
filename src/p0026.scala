// https://leetcode.com/problems/remove-duplicates-from-sorted-array
object Solution {
  def removeDuplicates(nums: Array[Int]): Int = {
    if (nums.isEmpty) 0
    else {
      var last = nums(0)
      var store = 1
      var index = 1
      while (index < nums.length) {
        val current = nums(index)
        if (current != last) {
          nums(store) = current
          last = current
          store += 1
        }
        index += 1
      }
      store
    }
  }
}
