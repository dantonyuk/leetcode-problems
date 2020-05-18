// https://leetcode.com/problems/decompress-run-length-encoded-list
object Solution {
  def decompressRLElist(nums: Array[Int]): Array[Int] =
    nums.grouped(2).map(x => Array.fill(x(0))(x(1))).flatten.toArray
}
