package DP;

public class PartitionSubSet {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,3,5,11};
		PartitionSubSet partitionSubSet = new PartitionSubSet();
		System.out.println(partitionSubSet.canPartition(nums));
	}

	public boolean canPartition(int[] nums) {
		
		int s =0;
		for(int i=0;i<nums.length;i++) {
			s+=nums[i];
		}
		if(s%2!=0)
			return false;
		
		boolean [] dp = new boolean [s+1];
		int max=0;
	
		for(int i=0;i<nums.length;i++) {
		
			for(int j=1;j<=max;j++) {
			if(dp[j]==true)
				dp[j+nums[i]]=true;
			}
			dp[nums[i]]= true;
			if(max<nums[i]+max) 
				max = nums[i]+max;
			
			}
		
		return dp[s/2];
		
	}

}
