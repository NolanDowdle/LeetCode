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
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);
        
        if(root.left != null && root.right != null) {
            if(left > right) {
                return right + 1;
            } else {
                return left + 1;
            }
        } else {
            if(left > right) {
                return left + 1;
            } else {
                return right + 1;
            }
        }
    }
}
