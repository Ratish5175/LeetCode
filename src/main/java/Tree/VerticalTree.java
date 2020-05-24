package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class VerticalTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeNode treeNode = new TreeNode(1);
		TreeNode root = treeNode;
		treeNode.left = new TreeNode(2);
		treeNode= root;
		treeNode.right = new TreeNode(3);
		treeNode= root;
		treeNode.left.left = new TreeNode(4);
		treeNode= root;
		treeNode.left.right = new TreeNode(5);
		treeNode= root;
		treeNode.right.left= new TreeNode(6);
		treeNode= root;
		treeNode.right.right= new TreeNode(7);
		
		VerticalTree verticalTree = new VerticalTree();
		verticalTree.verticalTraversal(root);
				
		
		
	}
	
    TreeMap<String,List<Integer>> vTable = new TreeMap<String,List<Integer>>();
    
    public void traverse(TreeNode root,int index , int level ){
        List<Integer> temp;
        if(root!=null){
            traverse(root.left,index-1,level+1);
            if(vTable.get(index+"-"+level)==null){
                temp = new ArrayList<Integer>();               
            }
            else
            {
                temp = vTable.get(index+"-"+level);               
            }
            temp.add(root.val);
            vTable.put(index+"-"+level,temp);    
            traverse(root.right,index+1,level+1);
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
            
        
        traverse(root,0,0);
        List<List<Integer>> res = new ArrayList<>();
       
        for(String t : vTable.keySet()){
            System.out.println(t);
          //  Collections.sort(vTable.get(t));
            List<Integer> temp =vTable.get(t); 
            res.add(temp);
        }
        
        return res;
    }
/*
 * 
 * [0,5,1,9,null,2,null,null,null,null,3,4,8,6,null,null,null,7]
 *                         0
 *                        / \  
 *                   -1  5   1 1
 *                      /   /  
 *                  -2 9   2 0 
 *                          \
 *                           3 1
 *                          / \
 *                     -1  4   8 2
 *                        /
 *                   -2  6
 *                      /
 *                  -3 7 
 *                  
 *                  Expected [[9,7],[5,6],[0,2,4],[1,3],[8]]
 *                  Output [[7,9],[5,6],[0,2,4],[1,3],[8]]
 *
 *
 */
}
