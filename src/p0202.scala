// https://leetcode.com/problems/happy-number
object Solution {
    def isHappy(n: Int): Boolean = {
        var x = n
        while (true) {
            var s = 0
            while (x > 0) {
                val d = x % 10
                s += d * d
                x /= 10
            }
            if (s == 1 || s == 7) {
                return true
            }
            if (s < 10) {
                return false
            }
            x = s
        }
        throw new IllegalStateException()
    }
}
