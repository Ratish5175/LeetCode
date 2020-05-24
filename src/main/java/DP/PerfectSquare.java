package DP;

public class PerfectSquare {

	public static void main(String[] args) {

		PerfectSquare perfectSquare = new PerfectSquare();
		System.out.print(perfectSquare.numSquares(12));
	}

	 public int numSquares(int n) {
	 
		 
		 int a = (int )Math.sqrt(n);
		 int arr[] = new  int [a+1];
		 
		 for(int i=1;i<arr.length;i++)
			 arr[i] = (int)Math.pow(i, 2);
		 int [][]dp = new int [a+1][n+1];
		 
		 int max = n;
		 for(int i=1;i<=n;i++)
			 dp[1][i] = i;
		 int m =1;
		 for(int i=2;i<=a;i++) {
			 for(int j=arr[i]; j<=n ;j++) {
				 if(j%arr[i] == 0 ) {
					 dp[i][j] = j/arr[i];
					 m= dp[i][j];
				 }
					 
				 else
					 dp[i][j] = dp[i-1][j-arr[i]*m]+1;
			 }
			 if(dp[i][n]< max)
				 max = dp[i][n];
		 }
		 
		 return  max;
		 
	 }
}
