// https://leetcode.com/problems/peak-index-in-a-mountain-array
object Solution {
  def peakIndexInMountainArray(A: Array[Int]): Int = {
    val xs = LazyList.from(A)
    ((xs lazyZip xs.tail lazyZip xs.tail.tail).map {
      (x,y,z) => x<y && y>z
    }).zipWithIndex.find(_._1).map(_._2 + 1).get
  }
}