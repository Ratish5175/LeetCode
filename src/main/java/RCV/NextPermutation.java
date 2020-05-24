package RCV;

import java.util.Arrays;

public class NextPermutation {

	public int[] nextPermutation(int [] nums)
	{
		boolean check = false;
		int len = nums.length ;
//		for(int i=0 ;i<len;i++)
//		{
			for(int j=len -1  ;j>=1;j--)
			{
				if(isNextPerm(nums,j))
					{
						check = true;
						break;
					}
			}
	//	}
			
			if(!check)
				Arrays.sort(nums);
		
		
		return nums;
	}
	

	private boolean isNextPerm(int[] nums, int j) {
		int [] temp = nums.clone();
		int var = temp [j];
		temp [j] = temp[j-1];
		temp [j-1]= var;
		int org = Integer.valueOf(ToString(nums));
		int change = Integer.valueOf(ToString(temp));
		if(org < change )
		{
			nums = temp;
			return true;
		}
		else 
			return false;
	}
	private String ToString(int[] nums) {
		// TODO Auto-generated method stub
	String res ="";
		for(int a : nums )
			res=res+a;
		return res;
	}


	public static void main(String[] args)
	{
		NextPermutation nextPermutation = new NextPermutation();
		
		int [] nums = {1,2,3};
		nextPermutation.nextPermutation(nums);
		for (int a :nums )
		{
			System.out.println(a);
		}
	}
}
