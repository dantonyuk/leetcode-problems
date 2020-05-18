// https://leetcode.com/problems/squares-of-a-sorted-array
object Solution {
  import Math.abs

  def sortedSquares(A: Array[Int]): Array[Int] = {
    var (i, j, k) = (0, A.length - 1, A.length - 1)
    val ar = Array.ofDim[Int](A.length)
    while (i <= j) {
      if (abs(A(i)) < abs(A(j))) {
        ar(k) = A(j) * A(j)
        j -= 1
      } else {
        ar(k) = A(i) * A(i)
        i += 1
      }
      k -= 1
    }
    ar
  }
}
