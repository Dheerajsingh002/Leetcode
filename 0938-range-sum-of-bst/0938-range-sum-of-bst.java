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
    int ans;
    public int rangeSumBST(TreeNode root, int l, int r) {
        ans=0;
        dfs(root,l,r);
        return ans;
    
}
public void dfs(TreeNode node,int l,int r)
    {
          if(node!=null)
        {
            if(l<=node.val && node.val<=r)
                ans+=node.val;
            if(l<node.val)
                dfs(node.left,l,r);
            if(node.val<r)
                dfs(node.right,l,r);       
        }
    }
}