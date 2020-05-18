# https://leetcode.com/problems/n-ary-tree-preorder-traversal
"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""
class Solution:
    def preorder(self, root: 'Node') -> List[int]:
        result = []
        stack = root and [root]
        while stack:
            node = stack.pop()
            stack += (node.children or [])[::-1]
            result.append(node.val)
        return result
