// https://leetcode.com/problems/excel-sheet-column-number
object Solution {
  def titleToNumber(s: String): Int = {
    val p26s = LazyList.iterate(1)(_ * 26)
    val diff = p26s.take(s.length).sum
    val digits = s.map(_ - 'A').reverse
    val num = p26s zip digits map { case (l,r) => l * r }
    num.sum + diff
  }
}
