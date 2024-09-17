/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> inOrderList = new LinkedList<>();
        helper(root, inOrderList);
        return inOrderList.get(k-1);
    }

    private void helper(TreeNode treeNode, List<Integer> inOrderList) {
        if (treeNode == null) return;
        helper(treeNode.left, inOrderList);
        inOrderList.add(treeNode.val);
        helper(treeNode.right, inOrderList);
    }
}