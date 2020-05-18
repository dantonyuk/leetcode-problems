// https://leetcode.com/problems/intersection-of-two-linked-lists
/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func length(l *ListNode) int {
    count := 0
    for {
        if l == nil {
            break
        }
        l = l.Next
        count++
    }
    return count
}

func getIntersectionNode(headA, headB *ListNode) *ListNode {
    lA := length(headA)
    lB := length(headB)
    headLongest, headShortest, diff := headA, headB, lA-lB
    if lA < lB {
        headLongest, headShortest, diff = headB, headA, -diff
    }
    for i := 0; i < diff; i++ {
        headLongest = headLongest.Next
    }
    for {
        if headLongest == headShortest {
            return headLongest
        }
        headLongest = headLongest.Next
        headShortest = headShortest.Next
    }
    return nil
}
