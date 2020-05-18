// https://leetcode.com/problems/to-lower-case
object Solution {
  def toLowerCase(str: String): String = {
    def lower(c: Char) =
      if (c >= 'A' && c <= 'Z') (c + ('a' - 'A')).toChar else c
    str.map(lower)
  }
}
