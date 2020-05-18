// https://leetcode.com/problems/linked-list-cycle
/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func hasCycle(head *ListNode) bool {
    double := head
    for {
        if double == nil {
            return false
        }

        next := double.Next
        if next == nil {
            return false
        }

        double = next.Next
        head = head.Next

        if head == double {
            return true
        }
    }
}
