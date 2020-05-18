// https://leetcode.com/problems/plus-one
object Solution {
  def plusOne(digits: Array[Int]): Array[Int] =
    (BigInt(digits.mkString) + 1).toString.map(_.toString.toInt).toArray
}
