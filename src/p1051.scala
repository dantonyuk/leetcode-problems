// https://leetcode.com/problems/height-checker
object Solution {
  def heightChecker(heights: Array[Int]): Int =
    (heights lazyZip heights.sorted).filter(_ != _).size
}
