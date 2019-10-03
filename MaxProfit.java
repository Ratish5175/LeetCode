package DP;
public class MaxStockProfit {

	public int maxProfit(int[] arr) {

		int max = Integer.MIN_VALUE;
		int big = -1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (big < arr[i]) {
				big = arr[i];
			} else if (big > arr[i] && max < big - arr[i]) {
				max = big - arr[i];
			}
		}

		if (max < 0)
			return 0;
		else
			return max;
	}
	public static void main(String[] args) {
	
		MaxStockProfit maxStockProfit = new MaxStockProfit();
		int [] arr = {6,4,1};

		System.out.print(maxStockProfit.maxProfit(arr));
	}
}
