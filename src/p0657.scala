// https://leetcode.com/problems/robot-return-to-origin
object Solution {
  def judgeCircle(moves: String): Boolean = {
    def count(c: Char) = moves.count(_ == c)
    count('R') == count('L') && count('U') == count('D')
  }
}
