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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

       

        if(root==null){
            return false;
        }



        if(isSame(root,subRoot)){
            return true;
        }
        

        TreeNode lefta = root.left;
        TreeNode righta = root.right;
        TreeNode leftb = subRoot.left;
        TreeNode rightb = subRoot.right;

        if((isSame(lefta,subRoot)||isSame(righta,subRoot))){
            return true;
        }

        return isSubtree(lefta,subRoot)||isSubtree(righta,subRoot);

    }

    public boolean isSame(TreeNode a, TreeNode b) {

        if(a==null&&b==null){
            return true;
        }

        if(a==null && b!=null){
            return false;
        }

        if(a!=null && b==null){
            return false;
        }

        if(a.val!=b.val){
            return false;
        }

        TreeNode lefta = a.left;
        TreeNode righta = a.right;
        TreeNode leftb = b.left;
        TreeNode rightb = b.right;

        return isSame(righta,rightb)&&isSame(leftb,lefta);

    }
}
