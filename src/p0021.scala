// https://leetcode.com/problems/merge-two-sorted-lists
/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 *   var next: ListNode = null
 *   var x: Int = _x
 * }
 */
object Solution {
  object LN {
    def unapply(ln: ListNode) = Option(ln).map(ln => (ln, ln.next))
  }

  def concat(l: ListNode, r: ListNode) = { l.next = r; l }

  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = (l1, l2) match {
    case (null, l2) => l2
    case (l1, null) => l1
    case (LN(n1, ns1), LN(n2, ns2)) =>
      if (n1.x < n2.x) concat(n1, mergeTwoLists(ns1, l2))
      else             concat(n2, mergeTwoLists(ns2, l1))
  }
}
