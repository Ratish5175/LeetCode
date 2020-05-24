package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MaximalSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] arr= {{1,1,1,0,0},
					  {1,1,1,0,0},
					  {1,1,1,0,0},
					  {0,0,0,1,1}};
		
//		int [][] arr = {{0,1},{0,0}};
		
		MaximalSquare maximalSquare = new MaximalSquare();
		maximalSquare.maximal(arr);
	}
	
	public String getNext(int i , int j, int r, int c) {
		String res = "";
		if(i>=0 && i < r && j>=0 && j<c) {
			res = i+"_"+j;
		}
		return res;
	}
	public void add(String val , Queue<String> q) {
		if(val!="")
			q.add(val);
	}
	public int maximal(char[][] matrix) {
        Queue<String> index = new LinkedList<String>();
        
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c ;j++){
                if(matrix[i][j]==1){
                	index.add(i+"_"+j);
                }
                while(!index.isEmpty()) {
                	String [] item = index.poll().split("_");
                	int x  =Integer.valueOf(item[0]);
                	int y = Integer.valueOf(item[1]);
                	
                	add(getNext(x+1, y+1, r, c),index);
                	add(getNext(x, y+1, r, c),index);
                	add(getNext(x+1, y, r, c),index);
                }
            }
        }
		return c;
    }

	
	
	
	private int foo(int i, int j, int r, int c, int[][] arr, int cunt) {
		int l, right,d,dw;
		if(i<r && j<c && i>=0 && j>=0) {
			if(arr[i][j]==1) {
				arr[i][j]=-1;
				//foo(i-1,j,r,c,arr);//up
				dw =foo(i+1,j+1,r,c,arr,cunt+1);//diagnol
				d = foo(i+1,j,r,c,arr,cunt+1);//down
				l=  foo(i,j-1,r,c,arr,cunt+1);//left
				right = foo(i,j+1,r,c,arr,cunt+1);//right
				return Math.min(Math.min(Math.min(dw, d),right),l);
			}		
		}
		return cunt-1;
	}
}
