// https://leetcode.com/problems/valid-palindrome
object Solution {
  def isPalindrome(s: String): Boolean = {
    val normalized = s.toLowerCase.filter(_.isLetterOrDigit)
    normalized == normalized.reverse
  }
}
