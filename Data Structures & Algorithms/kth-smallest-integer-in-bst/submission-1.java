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
    List<Integer> arr = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        
        if (root.left != null) {
            kthSmallest(root.left, k);
            
        }
        arr.add(root.val);

        
        if (root.right != null) {
            kthSmallest(root.right, k);
            
            
        }
        if(arr.size()>=k){
            return arr.get(k-1);

        }else{
            return -1;
        }
    }
}
