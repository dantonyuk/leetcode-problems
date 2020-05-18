// https://leetcode.com/problems/split-a-string-in-balanced-strings
object Solution {
  def balancedStringSplit(s: String): Int = {
    def removeBalancedPrefix(i: Int): Int =
      if (i == s.length) i
      else {
        var balance = 0
        var index = i
        var first = true
        while (first || balance != 0) {
          s(index) match {
            case 'L' => balance += 1
            case 'R' => balance -= 1
          }
          first = false
          index += 1
        }
        index
      }
    var count = 0
    var index = 0
    while (index < s.length) {
      index = removeBalancedPrefix(index)
      count += 1
    }
    count
  }
}
