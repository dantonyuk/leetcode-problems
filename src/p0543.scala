// https://leetcode.com/problems/diameter-of-binary-tree
/**
 * Definition for a binary tree node.
 * class TreeNode(var _value: Int) {
 *   var value: Int = _value
 *   var left: TreeNode = null
 *   var right: TreeNode = null
 * }
 */
object Solution {
  case class Height(var h: Int = 0)

  def diameterOfBinaryTree(root: TreeNode): Int = {
    def diameter(tree: TreeNode, h: Height): Int = {
      if (tree == null) {
        h.h = 0
        return 0
      }
      var lh = Height()
      var rh = Height()
      val ld = diameter(tree.left, lh)
      val rd = diameter(tree.right, rh)
      h.h = Math.max(lh.h, rh.h) + 1
      return Math.max(lh.h + rh.h, Math.max(ld, rd))
    }
    var h = Height()
    diameter(root, h)
  }
}
