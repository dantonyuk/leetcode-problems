// https://leetcode.com/problems/product-of-array-except-self
object Solution {
  def productExceptSelf(nums: Array[Int]): Array[Int] = {
    val output = Array.fill(nums.length)(1)

    var product = 1
    for (i <- 0 until nums.length) {
      output(i) *= product
      product *= nums(i)
    }

    product = 1
    for (i <- (nums.length - 1) to 0 by -1) {
      output(i) *= product
      product *= nums(i)
    }

    output
  }
}
