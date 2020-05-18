// https://leetcode.com/problems/sort-array-by-parity
object Solution {
  def sortArrayByParity(A: Array[Int]): Array[Int] = {
    type AI = Array[Int]
    ((_: AI) ++ (_: AI)).tupled(A.partition(_ % 2 == 0))
  }
}
