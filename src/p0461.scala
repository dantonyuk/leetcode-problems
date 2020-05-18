// https://leetcode.com/problems/hamming-distance
object Solution {
  def hammingDistance(x: Int, y: Int): Int = {
    def repr(n: Int) = n.toBinaryString.reverse.padTo(32, '0')
    val (xb, yb) = (repr(x), repr(y))
    (xb lazyZip yb).count { case (x,y) => x != y }
  }
}
