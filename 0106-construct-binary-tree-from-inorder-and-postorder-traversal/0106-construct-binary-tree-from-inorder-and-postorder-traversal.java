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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null) {
            return null;
        };

        HashMap<Integer, Integer> inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        };
        return buildSubTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, inorderIndexMap);
    };

    private TreeNode buildSubTree(int[] inorder, int inorderStart, int inorderEnd, int[] postorder, int postorderStart, int postorderEnd, HashMap<Integer, Integer> inorderIndexMap) {
        if (inorderStart > inorderEnd || postorderStart > postorderEnd) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[postorderEnd]);
        int rootIndexInInorder = inorderIndexMap.get(postorder[postorderEnd]);
        int leftSubtreeSize = rootIndexInInorder - inorderStart;

        root.left = buildSubTree(inorder, inorderStart, rootIndexInInorder - 1, postorder, postorderStart, postorderStart + leftSubtreeSize - 1, inorderIndexMap);
        root.right = buildSubTree(inorder, rootIndexInInorder + 1, inorderEnd, postorder, postorderStart + leftSubtreeSize, postorderEnd - 1, inorderIndexMap);

        return root;
    };
}