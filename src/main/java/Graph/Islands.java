package Graph;

import java.util.Queue;

public class Islands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr= {{1,1,0,0,0},
					  {1,1,0,0,0},
					  {0,0,1,0,0},
					  {0,0,0,1,1}};
		
//		int [][] arr = {{0,1},{0,0}};
		
		Islands islands = new Islands();
		islands.util(arr);
	}
	
	public void util(int[][] arr) {
		
		int r = arr.length;
		int c = arr[0].length;
	
		int count =0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j]==1) {
					count++;
					foo(i,j,r,c,arr);
				}				
			}
		}
		System.out.print(count);
	}

	
	
	
	private void foo(int i, int j, int r, int c, int[][] arr) {
		
		if(i<r && j<c && i>=0 && j>=0) {
			if(arr[i][j]==1) {
				arr[i][j]=-1;
				foo(i-1,j,r,c,arr);//up
				foo(i+1,j,r,c,arr);//down
				foo(i,j-1,r,c,arr);//left
				foo(i,j+1,r,c,arr);//right	
			}		
		}
	}
}
