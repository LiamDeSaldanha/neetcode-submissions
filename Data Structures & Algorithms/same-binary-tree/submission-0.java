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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null &&q==null){
            return true;
        }

        if(p==null&&q!=null){
            return false;
        }

        if(q==null&&p!=null){
            return false;
        }
        if(p.val != q.val){
            return false;

        }

        TreeNode leftp = p.left;
        TreeNode rightp = p.right;

        TreeNode leftq = q.left;
        TreeNode rightq = q.right;


        return isSameTree(rightq,rightp)&&isSameTree(leftp,leftq);


    }
}
