/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
            return result;
        traverse(root, 0);
        return result;
    }

    private void traverse(TreeNode node, int curLevel) {
        if (node == null)
            return;
        if (result.size() == curLevel) {
            result.add(new LinkedList<>());
        }

        List<Integer> level = result.get(curLevel);
        if (curLevel % 2 == 1) {
            level.addFirst(node.val);
        } else {
            level.addLast(node.val);
        }

        traverse(node.left, curLevel + 1);
        traverse(node.right, curLevel + 1);
    }
}