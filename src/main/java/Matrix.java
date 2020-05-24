import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] mat = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
		Matrix matrix = new Matrix();
		matrix.diagonalSort(mat);
				
	}

    public int[][] diagonalSort(int[][] mat) {

    	int r = mat.length;
    	int c = mat[0].length;
    	int [][] arr = new int [2*(r+c)][2*(r+c)];
    	HashMap<Integer, Integer> look = new HashMap<Integer, Integer>();
    	int d =0;
    	for(int i=0;i<r;i++) {
    		for(int j=0;j<c;j++) {
    			if(i-j==0) {
    				d= look.getOrDefault(i-j, 0);
    				arr[i-j][d]= mat[i][j];
    				look.put(i-j, d+1);
    			}
    			else if(i-j <0) {
    				d= look.getOrDefault(i-j, 0);
    				arr[j-i][d]= mat[i][j];
    				look.put(i-j, d+1);
    			}
    			else if(i-j>0) {
    				d= look.getOrDefault(i-j+r+c, 0);
    				arr[i-j+r+c][d]= mat[i][j];
    				look.put(i-j+r+c, d+1);
    			}
    		}
    	}
    	
    	for(int [] brr: arr) {
    		Arrays.sort(brr); 
    	}
    		//Arrays.sort(arr[i],Collections.reverseOrder());
    	
    	for(int i=0;i<r;i++) {
    		for(int j=0;j<c;j++) {
    			if(i-j==0)
    			{
    				d = look.get(i-j);
    				int b = 2*(r+c)-d;
    				mat[i][j]= arr[i-j][b];
    				look.put(i-j, d-1);
    			}
    			else if(i-j<0)
    			{
    				d = look.get(i-j);
    				int b = 2*(r+c)-d;
    				mat[i][j]= arr[j-i][b];
    				look.put(i-j, d-1);
    			}
    			if(i-j>0)
    			{
    				d = look.get(i-j+r+c);
    				int b = 2*(r+c)-d;
    				mat[i][j]= arr[i-j+r+c][b];
    				look.put(i-j+r+c, d-1);
    			}
    		}
    	}
    	return mat;
    }
}
