// https://leetcode.com/problems/palindrome-number/
object Solution {
    def isPalindrome(x: Int): Boolean = {
        if (x < 0 || x % 10 == 0 && x != 0) return false
        var y = x
        var rev = 0
        while (y > rev) {
            rev = rev * 10 + y % 10
            y /= 10
        }
        return y == rev || y == rev/10
    }
}
