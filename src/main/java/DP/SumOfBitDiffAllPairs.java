package DP;

public class SumOfBitDiffAllPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,3,5};
		SumOfBitDiffAllPairs sumOfBitDiffAllPairs  = new 
				SumOfBitDiffAllPairs();
		
		System.out.println(sumOfBitDiffAllPairs.Compute(arr));
				
	}
	
	public int Compute(int [] arr)
	{
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0 ;j<arr.length;j++)
			{
				int res = arr[i]^arr[j];
				
				int rs = res;
			while(rs>0) {
				if((rs&1)==1)
					c++;
				 rs = rs>>1;
			}
			
			}
		}
		return c;
	}

}
