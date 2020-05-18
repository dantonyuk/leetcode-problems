// https://leetcode.com/problems/find-numbers-with-even-number-of-digits
object Solution {
  def hasEvenDigits(n: Int): Boolean = {
    if (n == 0) return false
    var result = 0
    var x = n
    while (x != 0) {
      x /= 10
      result += 1
    }
    result % 2 == 0
  }

  def findNumbers(nums: Array[Int]): Int =
    nums.count(hasEvenDigits)
}

