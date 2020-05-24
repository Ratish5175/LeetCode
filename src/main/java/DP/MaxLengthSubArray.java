package DP;

public class MaxLengthSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {0,0,0,0,1};
		int [] B = {1,0,0,0,0};
		
		MaxLengthSubArray maxLengthSubArray = new MaxLengthSubArray();
		System.out.println(maxLengthSubArray.findLength(A, B));
	}
	
    public int findLength(int[] A, int[] B) {
     
    	int [][] dp = new int [A.length][B.length];
    	int r = A.length;
    	int c = B.length;
    	int max=Integer.MIN_VALUE;
    	for(int i=0;i<1;i++) {
    		for(int j=i;j<c;j++) {
    			if(B[i]==A[j]) {
    				dp[i][j]=1;
    				max=1;
    			}
    			if(B[j]==A[i]) {
    				dp[j][i]=1;
    				max=1;
    			}
    		}
    	}
    		
    	for(int i=1;i<r;i++) {
    		for(int j=1;j<c;j++) {
    			if(B[i]==A[j])
    			{
    				dp[i][j]=dp[i-1][j-1]+1;
    				if(dp[i][j]>max)max= dp[i][j];
    			}	
    		}
    	}
    	return max;
    }

}
