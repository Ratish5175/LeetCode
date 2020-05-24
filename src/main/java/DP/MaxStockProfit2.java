package DP;

public class MaxStockProfit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prices ={1,2,3,4,5};//
		//{7,1,5,3,6,4};
				//{7,6,4,3,1};////{1,2,3,4,5};
		MaxStockProfit2 maxStockProfit2 = new MaxStockProfit2();
		System.out.println(maxStockProfit2.maxProfit(prices));
	}

	   public int maxProfit(int[] prices) {
		   int n = prices.length;
		   int[]dp = new int [n];
		   
		   for(int i=0;i<n;i++) {
			   dp[i] = Math.max(0, prices[i]- prices[0]);
		   }
		
		   int max =0;
		   for(int i=1;i<n;i++) {
			   for(int j=i;j<n;j++) {
				   dp[j] = Math.max(Math.max(dp[i] +prices[j]-prices[i], dp[i]  ), dp[j-1]);
				   if(max<dp[j])
					   max = dp[j];
			   }
		   }
		   return max;
	    }
}
