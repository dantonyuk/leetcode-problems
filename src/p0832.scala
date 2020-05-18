// https://leetcode.com/problems/flipping-an-image
object Solution {
  def flipAndInvertImage(A: Array[Array[Int]]): Array[Array[Int]] =
    A.map(_.map(1 - _).reverse)
}
