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
     
   
    
    static void inorder(TreeNode root,ArrayList<Integer> arr)
{
    if(root !=null)
		{
			inorder(root.left,arr);
			arr.add(root.val);
			inorder(root.right,arr);
		}
}
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> arr  = new ArrayList<Integer>();	
		inorder(root,arr);
        int minMum = arr.get(arr.size()-1);
        for(int a=0;a<arr.size()-1;a++)
        {
            minMum = Math.abs(Math.min(minMum ,arr.get(a+1)- arr.get(a)));
        }
        return minMum;
	}
}