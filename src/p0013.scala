// https://leetcode.com/problems/roman-to-integer/
object Solution {
    def romanToInt(s: String): Int = {
        def go(r: Seq[Char]): Int = r match {
            case Seq(x) => x
            case Seq(x, y, rest @ _*) => (if (x < y) -x else x) + go(y +: rest)
        }
        go(s.toSeq.map {
            case 'I' => 1
            case 'V' => 5
            case 'X' => 10
            case 'L' => 50
            case 'C' => 100
            case 'D' => 500
            case 'M' => 1000
        })
    }
}
