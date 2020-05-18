// https://leetcode.com/problems/minimum-time-visiting-all-points
object Solution {
  def distance(p1: Array[Int], p2: Array[Int]) = {
    val x = Math.abs(p1(0) - p2(0))
    val y = Math.abs(p1(1) - p2(1))
    Math.min(x, y) + Math.abs(x - y)
  }

  def minTimeToVisitAllPoints(points: Array[Array[Int]]): Int =
    if (points == null || points.isEmpty) 0
    else points.lazyZip(points.tail).map(distance).sum
}
