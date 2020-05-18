// https://leetcode.com/problems/invert-binary-tree
object Solution {
  def invertTree(root: TreeNode): TreeNode = {
    if (root == null) null
    else {
      var result = new TreeNode(root.value)
      result.left = invertTree(root.right)
      result.right = invertTree(root.left)
      result
    }
  }
}
