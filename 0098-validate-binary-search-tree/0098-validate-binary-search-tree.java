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
    public boolean isValidBST(TreeNode root) {
        List<Integer> inOrderList = new LinkedList<>();
        helper(root, inOrderList);
        
        boolean isBST = true;
        int prev = inOrderList.get(0);
        for (int i = 1; i < inOrderList.size(); i++) {
            if (inOrderList.get(i) <= prev) {
                isBST = false;
                break;  // No need to continue checking if it's already false
            }
            prev = inOrderList.get(i);
        }

        return isBST;
    }

    private void helper(TreeNode treeNode, List<Integer> inOrderList) {
        if (treeNode == null) return;
        helper(treeNode.left, inOrderList);
        inOrderList.add(treeNode.val);
        helper(treeNode.right, inOrderList);
    }
}
