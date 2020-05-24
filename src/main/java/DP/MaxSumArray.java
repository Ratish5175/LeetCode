package DP;

public class MaxSumArray {

	public static void main(String[] args) {
		int [] arr = {1,-1,-2};
		
		System.out.print(maxSumArray(arr));
	}

	private static int maxSumArray(int[] arr) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		int s =0,i;
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
				break;
			if(max<arr[i])
				max= arr[i];
		}
		if(i==arr.length)
			return max;
		s=arr[i];
		max= arr[i];
		for(int j=i;j<arr.length-1;j++)
		{
			
			if(arr[j+1]>0 )
				s+=arr[j+1];
			else if(Math.abs(arr[j+1]) <s) {
				s+=arr[j+1];
			}
			else
				s=0;		
			if(s>max)max=s;
				
		}
		if(s>max)max=s;
		return max;		
	}
}
