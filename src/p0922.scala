// https://leetcode.com/problems/sort-array-by-parity-ii
object Solution {
  def sortArrayByParityII(A: Array[Int]): Array[Int] = {
    var (odd, even) = (1, 0)
    while (even < A.length) {
      if (A(even) % 2 == 1) {
        while (A(odd) % 2 == 1) odd += 2
        val tmp = A(odd); A(odd) = A(even); A(even) = tmp
      }
      even += 2
    }
    A
  }
}