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
    public TreeNode sortedArrayToBST(int[] nums) {

        return bst(0,nums.length,nums);
    }

    public TreeNode bst(int low , int high, int [] arr)
    {

        if(low==high)
            return null;
        int mid = (low+high)/2;

        TreeNode n = new TreeNode(arr[mid]);

        n.left=bst(low,mid,arr);
        n.right=bst(mid+1,high,arr);

        return n;
    }
}
