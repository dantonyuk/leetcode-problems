// https://leetcode.com/problems/unique-number-of-occurrences
object Solution {
  def uniqueOccurrences(arr: Array[Int]): Boolean = {
    val occurrences = arr.groupMapReduce(n => n)(n => 1)(_ + _).values
    occurrences.size == occurrences.toSet.size
  }
}
