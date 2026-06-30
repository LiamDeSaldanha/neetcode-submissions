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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if(root==null){
            return new ArrayList<>();
        }
        q.offer(root);

        while(!q.isEmpty()){
            int len = q.size();
            TreeNode rightmost = null;

            for(int i = 0 ; i<len;i++){

                rightmost = q.poll();
                //System.out.println(rightmost.val);
                if(rightmost.left!=null){
                    q.offer(rightmost.left);
                }

                if(rightmost.right!=null){
                    q.offer(rightmost.right);
                }

            }
            if(rightmost!=null){
            res.add(rightmost.val);

            }




        }
        return res;


    }
}
