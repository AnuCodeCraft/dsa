# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def invertTree(self, root: TreeNode | None) -> TreeNode | None:
        if root is None:
            return None
        stack = []
        stack.append(root)
        while len(stack):
            curr = stack.pop()
            if curr.left:
                stack.append(curr.left)
            if curr.right:
                stack.append(curr.right)
            curr.left, curr.right = curr.right, curr.left
        return root