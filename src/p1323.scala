// https://leetcode.com/problems/maximum-69-number
object Solution {
  def maximum69Number (num: Int): Int = {
    val (l, r) = num.toString.span(_ == '9')
    (l + (if (r == "") "" else '9' + r.tail)).toInt
  }
}
