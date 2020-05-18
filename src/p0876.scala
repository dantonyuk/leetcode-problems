// https://leetcode.com/problems/middle-of-the-linked-list
/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 *   var next: ListNode = null
 *   var x: Int = _x
 * }
 */
object Solution {
  def middleNode(head: ListNode): ListNode = {
    var fast = head
    var slow = head
    while (fast != null && fast.next != null) {
      fast = fast.next.next
      slow = slow.next
    }
    slow
  }
}
