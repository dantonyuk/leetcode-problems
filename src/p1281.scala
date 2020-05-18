// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer
object Solution {
  def subtractProductAndSum(n: Int): Int = {
    val digits = n.toString.map(d => (d - '0').toInt)
    digits.product - digits.sum
  }
}
