// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping
object Solution {
  def freqAlphabets(s: String): String = {
    val num = """(\d(?:\d(?=#))?)#?""".r
    num.replaceAllIn(s, { case num(x) => (x.toInt + 96).toChar.toString })
  }
}
