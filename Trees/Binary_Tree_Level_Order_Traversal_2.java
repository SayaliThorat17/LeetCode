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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> ans = new ArrayList();

        if(root==null)
            return ans;

         bfs(root,ans);

         //Collections.reverse(ans);

        return ans;
    }

    public List<List<Integer>> bfs(TreeNode n, List<List<Integer>> l)
    {
        Queue<TreeNode> q = new LinkedList();
        q.add(n);
        while(!q.isEmpty())
        {
            List<Integer> arr = new ArrayList();
            int siz = q.size();
            while(siz-- > 0)
            {
                TreeNode t = q.poll();
                arr.add(t.val);

                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
            }

            l.add(0,arr);                   //(index,list) ...so everytime new list is added at 0th position so no need to use reverse
        }

        return l;
    }
}
