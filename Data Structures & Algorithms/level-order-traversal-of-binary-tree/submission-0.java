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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<TreeNode> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        while(!queue.isEmpty()){

           TreeNode x =  queue.poll();
            if(x!=null){
                list.add(x);
                list2.add(x.val);
            }
            if(queue.isEmpty()){
                res.add(new ArrayList<Integer>(list2));

                for(int i =0;i<list.size();i++){
                    queue.offer(list.get(i).left);
                    queue.offer(list.get(i).right);
                }

                list.clear();
                list2.clear();
            }
        }
        res.remove(list2);
        return res;

    
    }
}
