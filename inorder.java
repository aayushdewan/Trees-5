
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
 * TC --> O(n)
 * SC --> O(h)
 */
class Solution {

    List<Integer> res;

    public List<Integer> inorderTraversal(TreeNode root) {
        res = new ArrayList<>();
        inOrder(root);
        return res;
    }

    public void inOrder(TreeNode root) {
        if (root != null) {

            inOrder(root.left);
            res.add(root.val);
            inOrder(root.right);

        }
    }
}
