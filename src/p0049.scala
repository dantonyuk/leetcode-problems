// https://leetcode.com/problems/group-anagrams
object Solution {
  def groupAnagrams(strs: Array[String]): List[List[String]] =
    strs.view.groupBy(_.toSeq.sorted).map(_._2.toList).toList
}
