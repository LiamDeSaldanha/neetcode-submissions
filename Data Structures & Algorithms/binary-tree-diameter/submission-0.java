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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root ==null){
            return 0;
        }
        int diameter = height(root.left)+height(root.right);
        int left =diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        right = Math.max(left,right);
        diameter = Math.max(diameter,right);
        return diameter;

    }

    public int height(TreeNode root) {

        if(root ==null){
            return 0;
        }


        return 1+ Math.max(height(root.left),height(root.right));

    }
}
