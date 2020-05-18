// https://leetcode.com/problems/range-sum-of-bst
/**
 * Definition for a binary tree node.
 * class TreeNode(var _value: Int) {
 *   var value: Int = _value
 *   var left: TreeNode = null
 *   var right: TreeNode = null
 * }
 */
object Solution {
  def rangeSumBST(root: TreeNode, L: Int, R: Int): Int = {
    def go(node: TreeNode) = rangeSumBST(node, L, R)

    if (root == null) 0
    else if (root.value < L) go(root.right)
    else if (root.value > R) go(root.left)
    else root.value + go(root.left) + go(root.right)
  }
}
