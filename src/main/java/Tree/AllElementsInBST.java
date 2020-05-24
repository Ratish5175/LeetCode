package Tree;

import java.util.ArrayList;
import java.util.List;


public class AllElementsInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void DFS(TreeNode root , List<Integer> t1)
	{
		if(root!=null)
		{
			DFS(root.left,t1);
			t1.add(root.val);
			DFS(root.right,t1);
		}
	}
	
	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
		
		List<Integer> res = new ArrayList<Integer>();
		
		List<Integer> t1= new ArrayList<Integer>();
		
		List<Integer> t2= new ArrayList<Integer>();
		DFS(root1,t1);
		DFS(root2,t2);
		
		int i=0;
		int j=0;
		while(i<t1.size() && j<t2.size()) {
			if(t1.get(i)<t2.get(j))
				res.add(t1.get(i++));
			else
				res.add(t2.get(j++));
		}
		while(i<t1.size()) {
			res.add(t1.get(i++));
		}
		while(j<t2.size()) {
			res.add(t2.get(j++));
		}
		return res;
    }

}
