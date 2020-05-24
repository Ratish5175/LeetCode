package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> RightSideOfTree(TreeNode root) {
		List<TreeNode> q = new LinkedList<TreeNode>();
		List<Integer> res = new LinkedList<Integer>();
 		q.add(root);
 		q.add(null);
 		
 		
 		TreeNode prev=null;
		while(!q.isEmpty())
		{
			TreeNode elem = q.remove(0);
			if(elem==null)
			{
				if(prev==null && elem == null)
					break;
				res.add(elem.val);
				q.add(null);
			}
			else {
			if(elem.left!=null)	
				q.add(elem.left);
			if(elem.right!=null)
				q.add(elem.right);
			}
			prev =elem;
		}
			int [] test = new int [6];
			Arrays.copyOfRange(test, 1, 6);
		return res;
	}
	  public int maxLevelSum(TreeNode root) {
		List<TreeNode> q = new LinkedList<TreeNode>();
	
 		q.add(root);
 		q.add(null);
 		int sum = 0;
 		int level=1;
 		int max_level=1;
 		int max = Integer.MIN_VALUE;
 		TreeNode prev=null;
		while(!q.isEmpty())
		{
			TreeNode elem = q.remove(0);
			if(elem==null)
			{
				if(max<sum) {
					max = sum;
					max_level=level;
					
				}
				if(prev==null && elem == null)
					break;
				q.add(null);
				sum=0;
				level++;
			}
			else {
				sum+=elem.val;
			if(elem.left!=null)	
				q.add(elem.left);
			if(elem.right!=null)
				q.add(elem.right);
			}
			prev =elem;
		}
		return max_level;
    }
}
