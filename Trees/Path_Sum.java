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
    public boolean hasPathSum(TreeNode root, int sum) {

        int total=0;
        return helper(root,sum,total);

    }

    public boolean helper(TreeNode node, int sum, int total) {

        if(node==null)
            return false;

        if(node.left==null && node.right==null )
            return (node.val+total==sum);


        return (helper(node.left,sum,node.val+total) || helper(node.right,sum,node.val+total));

    }


}
