// https://leetcode.com/problems/n-repeated-element-in-size-2n-array
object Solution {
  def repeatedNTimes(A: Array[Int]): Int = {
    (for (
      k <- 1 to 3;
      i <- 0 until (A.length - k);
      if A(i) == A(i + k)
    ) yield A(i)).head
  }
}
