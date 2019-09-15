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
    int sum =0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        
        if(root!=null)
        {
            
            rangeSumBST(root.left,L,R);

            if(root.val <=R && root.val >=L)
            {
                sum+= root.val;
            }
            rangeSumBST(root.right,L,R);
        }
        return sum;
    }
}