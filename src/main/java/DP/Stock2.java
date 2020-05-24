package DP;

public class Stock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock2 stock2 = new Stock2();
		int [] prices = {1,2,3,0,2};
		stock2.maxProfit(prices);
	}

	public int maxProfit(int[] prices) {
        
		int n = prices.length;
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++) {
				arr[i][j]=prices[j]- prices[i];
			}
		}
		int max =0;
		int c =0;
		int k =n;
		
		for (int l = 1; l < k - 1; l++) {
			int []brr =new int [k];
			c = 0;
			for (int i = 0; i < k - 1; i++) {
				
					brr[c++] = arr[i][l];
					max = Math.max(max, getMax(brr));
				
			}
			k--;
		}
		return 0;
    }

	private int getMax(int[] brr) {
		// TODO Auto-generated method stub
		int max=0;
		for(int i=0;i<brr.length;i++) {
			max = Math.max(max , utilGetMax(brr, i, brr.length));
		}
		return max;
	}

	private int utilGetMax(int[] brr, int i, int n) {
		
		
		if(i<n) {
			return (brr[i]+ utilGetMax(brr, i+3, n));
		}
		return 0;
	}

	
}
