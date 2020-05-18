// https://leetcode.com/problems/valid-parenthesis-string
object Solution {
  implicit def boolToInt(b: Boolean) = if (b) 1 else -1

  def checkValidString(s: String): Boolean = {
    var maxNum = 0
    var minNum = 0
    for (c <- s) {
      maxNum += (c != ')')
      minNum -= (c != '(')
      if (maxNum < 0) {
        return false
      }
      if (minNum < 0) {
        minNum = 0
      }
    }
    return minNum == 0
  }
}
