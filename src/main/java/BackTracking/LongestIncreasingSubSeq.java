package BackTracking;

public class LongestIncreasingSubSeq {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {10,9,2,5,3,7,101,18};
		//int [] nums = {10,9,2,5,3,4};
		LongestIncreasingSubSeq longestIncreasingSubSeq = new LongestIncreasingSubSeq();

		longestIncreasingSubSeq.util(nums);
		System.out.print(max_count);
	}
	public void util(int [] arr) {
		int prev =-5;
		for(int i=0;i<arr.length;i++) {
			foo(arr,i,prev);
			if(max_count<count)
				max_count = count;
			count =0;
			System.out.println();
		}
	}
	static int max_count =0;
	int count =0;
	public void foo(int[] arr , int i , int prev)
	{
		if(i>=arr.length)return ;
		else {
			for(int j=i+1;j<arr.length;j++) {	
				if(arr[i]>prev)
				{
					prev = arr[i];
					System.out.print(arr[i]+",");
					++count;
				}
				foo(arr,j,prev);
			}
		
		}
		
	}

}
