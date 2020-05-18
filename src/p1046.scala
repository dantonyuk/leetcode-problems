// https://leetcode.com/problems/last-stone-weight
object Solution {
  def lastStoneWeight(stonesArr: Array[Int]): Int = {
    var stones = stonesArr.toList.sortWith(_ > _)
    while (stones.size > 1) {
      val s1 = stones(0)
      val s2 = stones(1)
      stones = stones.tail.tail
      if (s1 != s2) stones = stones :+ (s1 - s2)
      stones = stones.sortWith(_ > _)
    }
    if (stones.size == 0) 0 else stones(0)
  }
}
