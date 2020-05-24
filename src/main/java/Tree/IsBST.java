package Tree;

import java.util.ArrayList;
import java.util.List;


public class IsBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode treeNode = new TreeNode(1);
		TreeNode root = treeNode;
		treeNode.left = new TreeNode(1);
		treeNode= root;
//		treeNode.right = new TreeNode(6);
//		treeNode= root;
//		treeNode.left.left = new TreeNode(1);
//		treeNode= root;
//		treeNode.left.right = new TreeNode(3);
		
		IsBST isBST = new IsBST();
		System.out.print(isBST.isValidBST(root));
		
	}
	public boolean inPlaceCheck(TreeNode root)
	{
		if(root!=null) {
			
			inPlaceCheck(root.left);
			if(root.left.val >= root.val ||
					root.right.val <= root.val)
			{
				return false;
			}
			inPlaceCheck(root.right);
		}
		return true;
	}
	 List<Integer> test =new  ArrayList<Integer>();
	    public boolean isValidBST(TreeNode root) {
	        
	        Inorder(root);
	        
	        for(int i=0;i<test.size()-1;i++)
	            {
	        		if(test.get(i)>= test.get(i+1))
	        			return false;
	            }
	        return true;
	    }
	    public void Inorder(TreeNode root)
	    {
	        if(root!=null)
	        { 
	            Inorder(root.left);
	            test.add(root.val);
	            Inorder(root.right);
	        }
	    }
}
