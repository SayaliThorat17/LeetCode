/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {

        return depth(root);
    }

    public int depth(TreeNode root)
    {
        if(root==null)
            return 0;
        else
        {
            int lheight = depth(root.left);
            int rheight = depth(root.right);

            if(lheight==0 || rheight==0)
                return (lheight+rheight+1);

            return Math.min(lheight+1,rheight+1);
        }
    }
}
