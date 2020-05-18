// https://leetcode.com/problems/array-partition-i
object Solution {
  def arrayPairSum(nums: Array[Int]): Int = {
    scala.util.Sorting.quickSort(nums)
    nums.view.grouped(2).map(_.head).sum
  }
}
