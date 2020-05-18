// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer
/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 *   var next: ListNode = null
 *   var x: Int = _x
 * }
 */
object Solution {
  def getDecimalValue(head: ListNode): Int = {
    var result = 0
    var next = head
    while (next != null) {
      result = 2*result + next.x
      next = next.next
    }
    result
  }
}
