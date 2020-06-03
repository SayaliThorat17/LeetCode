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
    public boolean isSymmetric(TreeNode root) {

                return root==null || check(root.left,root.right);
    }

    public boolean check(TreeNode l1, TreeNode l2)
    {
        if(l1==null && l2 ==null)
            return true;

        if(l1==null || l2==null)
            return false;

        if(l1.val != l2.val) return false;

        boolean a = check(l1.left,l2.right);

        if(!a) return false;

        check(l1.right,l2.left);

        boolean b = check(l1.right,l2.left);

        if(!b)
            return false;

        return true;
    }
}

//2nd Solution
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
    public boolean isSymmetric(TreeNode root) {

        Queue<TreeNode> q= new LinkedList<>();

        q.add(root);
        q.add(root);

        while(!q.isEmpty())
        {
            TreeNode a = q.poll();
            TreeNode b = q.poll();

            if(a==null && b==null)
                continue;
            if(a==null || b==null)
                return false;

            if(a.val != b.val)
                return false;

            q.add(a.left);
            q.add(b.right);
            q.add(a.right);
            q.add(b.left);

        }

        return true;

    }

}
