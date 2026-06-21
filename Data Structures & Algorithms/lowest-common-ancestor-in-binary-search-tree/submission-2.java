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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> lp = new ArrayList<>();
        List<TreeNode> lq = new ArrayList<>();

        TreeNode pointer = root;
        while (pointer != null) {
            if (q.val == pointer.val) {
                lq.add(pointer);

                break;
            } else if (q.val < pointer.val) {
                lq.add(pointer);
                if (pointer.left == null) {
                    break;
                }
                pointer = pointer.left;
            } else {
                lq.add(pointer);
                if (pointer.right == null) {
                    break;
                }
                pointer = pointer.right;
            }
        }

        pointer = root;
        while (pointer != null) {
            if (p.val == pointer.val) {
                lp.add(pointer);

                break;
            } else if (p.val < pointer.val) {
                lp.add(pointer);
                if (pointer.left == null) {
                    break;
                }
                pointer = pointer.left;
            } else {
                lp.add(pointer);
                if (pointer.right == null) {
                    break;
                }
                pointer = pointer.right;
            }
        }

        int min = Integer.MAX_VALUE;
        TreeNode minT = null;
        for (int i = lp.size()-1; i >=0 ; i--) {
            TreeNode t = lp.get(i);
            if (lq.contains(t)) {
                minT = t;
                break;
            }
        }
        System.out.println(lp);
        System.out.println(lq);
        System.out.println(p);
        System.out.println(q);
        return minT;
    }
}
