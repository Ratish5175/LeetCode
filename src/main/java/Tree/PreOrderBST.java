package Tree;

import java.util.Arrays;

public class PreOrderBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] preorder = {8,5,1,7,10,12};
		PreOrderBST preOrderBST = new PreOrderBST();
		preOrderBST.bstFromPreorder(preorder);
		
	}
	
	 boolean[] visited;
	    public int get_ind(int[] preorder , int[] inorder){
	        int i=0;
	        for( i=0;i<inorder.length;i++){
	            if(visited[i]==false)
	                break;    
	        }
	        visited[i]= true;
	        int j = i;
	        for(i=0;i<inorder.length;i++){
	            if(inorder[i]==preorder[j])
	                return i;
	        }
	        return -1;
	    }
	    public TreeNode bstFromPreorder(int[] preorder) {
	    	int [] inorder = new int[preorder.length];
	    	int c=0;
	    	for(Integer i : preorder)
	         inorder[c++]=i;
	        visited = new boolean [preorder.length];
	        Arrays.sort(inorder);
	        TreeNode root = foo(preorder,inorder,0,preorder.length-1);
	        System.out.print(root.val);
	        return root;
	        
	    }
	    public TreeNode foo(int [] preorder, int[] inorder,int l , int r){
	        if(l>=0 && r<=inorder.length-1 && r>=0 && l<= inorder.length-1 && l<=r){
	      
	            int ind = get_ind(preorder,inorder);
	            TreeNode root = new TreeNode(inorder[ind]);
	            root.left = foo(preorder,inorder,l,ind-1);
	            root.right = foo(preorder,inorder,ind+1,r);         
	            return root;
	        }
	        else
	            return null;
	    }

}
