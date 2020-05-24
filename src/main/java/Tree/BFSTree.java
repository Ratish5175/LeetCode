package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class BFSTree {

	public static List<Integer> largestValues(TreeNode root) {
		List<TreeNode> q = new ArrayList();
		List <Integer> res = new ArrayList<Integer>();
 		q.add(root);
 		q.add(null);
 		int max = Integer.MIN_VALUE;
 		res.add(root.val);
 		TreeNode prev=null;
		while(!q.isEmpty())
		{
			TreeNode elem = q.remove(0);
			if(elem==null)
			{
				if(prev==null && elem == null)
					break;
				res.add(max);
			
				max = Integer.MIN_VALUE;
			//	System.out.println();
				q.add(null);
			}
			else {
			q.add(elem.left);
			q.add(elem.right);
		//	System.out.print(elem.val);
			if(max<elem.val)
				max = elem.val;
			}
			prev =elem;
		}
		
		
		return res;
	
    }
	public static List<List<Integer>> LevelOrder(TreeNode root)
	{
		Queue<TreeNode> Q = new LinkedList<TreeNode>();
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		List<Integer> tep = new LinkedList<Integer>();
		Q.add(root);
		Q.add(null);
		while(!Q.isEmpty())
		{
			TreeNode r1 = Q.remove();
			if(r1==null) {
				System.out.println();
				res.add(tep);

				if(Q.isEmpty())break;
				Q.add(null);
				tep = new LinkedList<Integer>();
			}
			else {
				if(r1.left!=null)Q.add(r1.left);
				if(r1.right!=null)Q.add(r1.right);
				System.out.print(r1.val+",");
				tep.add(r1.val);
				
			}
		}
		
		int s=0;
		 for(int i=0;i<tep.size();i++)
	            s+=tep.get(i);
		return res;
	}
	
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	 List<Integer> res = new LinkedList<Integer>();
	    public  int  sumNumbers(TreeNode root) {
	        foo(root);
	        
	        return sum;
	    }
	    int sum=0;
	    public void foo(TreeNode root)
	    {
	    	
	    	if(root!=null ){
	            //update sum
	            if(root.val%2==0){
	            if(root.left!=null && root.left.left!=null){
	                sum  = sum + root.left.left.val;
	            }
	             if(root.left!=null && root.left.right!=null){
	                sum  = sum + root.left.right.val;
	            }
	            
	             if(root.right!=null && root.right.left!=null){
	                sum  = sum + root.right.left.val;
	            }
	             if(root.right!=null && root.right.right!=null){
	                sum  = sum + root.right.right.val;
	            }
	            }
	        
	         foo(root.left);
	         foo(root.right);
	        
	        }
	        
	    	
	    	
	    	
//	        if(root!=null){
//	        	 if(root.left == null && root.right == null)
//		                res.add(sum*10+root.val);
//	        	foo(root.left,sum*10+root.val);
//	            foo(root.right,sum*10+root.val);
//	           
//	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode treeNode = new TreeNode(2);
		TreeNode root = treeNode;
		treeNode.left = new TreeNode(1);
		treeNode= root;
		treeNode.right = new TreeNode(3);
		treeNode= root;
	//	treeNode.left.left = new TreeNode(null);
		treeNode= root;
		treeNode.left.right = new TreeNode(4);
		treeNode= root;
		//treeNode.left.left.right= new TreeNode(7);
		BFSTree bfsTree = new BFSTree();
		//bfsTree.sumNumbers(root);
		LevelOrder(root);
	//	for(Integer elem : largestValues(root))
	//		System.out.println(elem);
//		treeNode.left = new TreeNode(1);
//		treeNode.right = new TreeNode(3);
		
		
			
				
	}
}
