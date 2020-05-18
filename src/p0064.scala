// https://leetcode.com/problems/minimum-path-sum
object Solution {
  def minPathSum(grid: Array[Array[Int]]): Int = {
    val rows = grid.length
    if (rows == 0) return 0
    val cols = grid(0).length
  if (cols == 0) return 0

  val resultGrid = Array.ofDim[Int](rows, cols)
  for (i <- 0 until rows) {
    for (j <- 0 until cols) {
      if (i + j == 0) resultGrid(0)(0) = grid(0)(0)
      else {
        val up = if (i > 0) resultGrid(i - 1)(j) else Int.MaxValue
        val left = if (j > 0) resultGrid(i)(j - 1) else Int.MaxValue
        resultGrid(i)(j) = Math.min(up, left) + grid(i)(j)
      }
    }
  }
  resultGrid(rows - 1)(cols - 1)
  }
}
