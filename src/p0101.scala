// https://leetcode.com/problems/symmetric-tree
/**
 * Definition for a binary tree node.
 * class TreeNode(var _value: Int) {
 *   var value: Int = _value
 *   var left: TreeNode = null
 *   var right: TreeNode = null
 * }
 */
object Solution {
  def isSymmetric(root: TreeNode): Boolean =
    root == null || isSymmetric(root.left, root.right)

  def isSymmetric(left: TreeNode, right: TreeNode): Boolean = {
    left == null && right == null ||
    left != null && right != null &&
    left.value == right.value &&
    isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left)
  }
}
