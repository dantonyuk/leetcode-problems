# https://leetcode.com/problems/n-ary-tree-postorder-traversal
"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""
class Solution:
    def postorder(self, root: 'Node') -> List[int]:
        result = []
        stack = root and [root]
        while stack:
            node = stack.pop()
            stack += node.children or []
            result.insert(0, node.val)
        return result

# Recursive solution
# class Solution:
#    def postorder(self, root: 'Node') -> List[int]:
#        if not root:
#            return []
#        return [n for child in root.children for n in self.postorder(child)] + [root.val]
