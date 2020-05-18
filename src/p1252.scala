// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix
object Solution {
  def oddCells(n: Int, m: Int, indices: Array[Array[Int]]): Int = {
    val rowSet = new java.util.BitSet
    val colSet = new java.util.BitSet

    indices.foreach { case Array(r, c) =>
      rowSet.flip(r)
      colSet.flip(c)
    }

    val rowNum = rowSet.cardinality
    val colNum = colSet.cardinality

    rowNum*m + colNum*n - 2*rowNum*colNum
  }
}

