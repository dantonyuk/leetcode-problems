// https://leetcode.com/problems/two-sum/
object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    import scala.collection.mutable
    val indices = mutable.Map[Int, Int]()
    var i = 0;
    for (v <- nums) {
      indices.get(target - v) match {
        case None =>
          indices(v) = i
          i += 1
        case Some(j) =>
          return Array(j, i)
      }
    }
    throw new IllegalStateException()
  }
}
