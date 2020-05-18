// https://leetcode.com/problems/self-dividing-numbers
object Solution {
  def selfDividingNumbers(left: Int, right: Int): List[Int] = {
    def digits(n: Int) = n.toString.map(_ - 48).toSet
    def isSelfDividing(n: Int) = {
      val digs = digits(n)
      !digs(0) && digs.forall(n % _ == 0)
    }
    (for (n <- left to right if isSelfDividing(n)) yield n).toList
  }
}
