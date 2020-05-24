package RCV;

import java.util.ArrayList;

public class MinDistanceBST {

	static int minMum= Integer.MAX_VALUE;
	static ArrayList<Integer> arr  = new ArrayList<Integer>();
	public static int minDist(TreeNode root)
	{
		if(root !=null)
		{
			minDist(root.left);
			arr.add(root.val);
			//minMum= Math.min(root.val, minMum);
			minDist(root.right);
			//minMum=  Math.min(minDist(root.left)-minDist(root.right),minMum);
		}
		
		for(int a =0;a<arr.size()-1;a++)
		{
			arr.get(arr.size()-1);
			minMum = Math.min(minMum, arr.get(a+1)- arr.get(a));
		}
		return minMum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode treeNode = new TreeNode(4);
		TreeNode root = treeNode;
		treeNode.left = new TreeNode(2);
		treeNode= root;
		treeNode.right = new TreeNode(6);
		treeNode= root;
		treeNode.left.left = new TreeNode(1);
		treeNode= root;
		treeNode.left.right = new TreeNode(3);
		System.out.println(minDist(root));
//		treeNode.left = new TreeNode(1);
//		treeNode.right = new TreeNode(3);
		
		
			
				
	}

}
