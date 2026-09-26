# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def solve(self, root, mn_node, mx_node):
        if root is None:
            return True
        if mn_node and root.val >= mn_node.val:
            return False
        if mx_node and root.val <= mx_node.val:
            return False
        return (
            self.solve(root.left, root, mx_node)
            and
            self.solve(root.right, mn_node, root)
        )
    def isValidBST(self, root: TreeNode | None) -> bool:
        return self.solve(root, None, None)