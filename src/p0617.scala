// https://leetcode.com/problems/merge-two-binary-trees
/**
 * Definition for a binary tree node.
 * class TreeNode(var _value: Int) {
 *   var value: Int = _value
 *   var left: TreeNode = null
 *   var right: TreeNode = null
 * }
 */
object Solution {
  def mergeTrees(t1: TreeNode, t2: TreeNode): TreeNode = {
    if (t1 == null) return t2
    if (t2 == null) return t1
    val tree = new TreeNode(t1.value + t2.value)
    tree.left = mergeTrees(t1.left, t2.left)
    tree.right = mergeTrees(t1.right, t2.right)
    tree
  }
}