// https://leetcode.com/problems/longest-common-prefix/
object Solution {
    def longestCommonPrefix(strs: Array[String]): String = {
        def prefix(s1: String, s2: String): String =
            (s1 zip s2).view.takeWhile{ case (l, r) => l == r }.map{ case (l, r) => l }.mkString

        if (strs.isEmpty) "" else strs.reduce(prefix)
    }
}
