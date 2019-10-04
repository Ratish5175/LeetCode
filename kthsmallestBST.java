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
    
    static int count =0;
    static int  ans =0;
    public void inOrder(TreeNode root, int k)
    {
        if(root!=null)
        {
            inOrder(root.left, k);
            count++;
            if(count == k)
               ans = root.val;
            inOrder(root.right,k);
        }
       
    }
    public int kthSmallest(TreeNode root, int k) {
        count =0;
        ans =0;
         inOrder(root,k);
        return ans;
    }
}