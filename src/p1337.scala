// https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix
object Solution {
  def kWeakestRows(mat: Array[Array[Int]], k: Int): Array[Int] = {
    LazyList.from(mat).map(_.takeWhile(_ == 1).size).zipWithIndex.sorted.take(k).map(_._2).toArray
  }
}
