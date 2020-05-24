package DP;

public class LongestIncreasingSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {5,2,8,7,3,1,6,4};
		LongestIncreasingSubSeq longestIncreasingSubSeq = new LongestIncreasingSubSeq();
		System.out.println(longestIncreasingSubSeq.lengthIncreasingSubSeq(nums));
	}
	
	public int lengthIncreasingSubSeq(int [] nums){
		
		int max =Integer.MIN_VALUE;
		
		int[] arr = new int [nums.length];
		arr[0]=1;
		for(int i=1;i<nums.length;i++) {
			for(int j=0;j<i;j++) {
				if(nums[i]>nums[j]) {
					arr[i]=Math.max(arr[j]+1,arr[i]);
				}
				else
					arr[i]= Math.max(arr[i], 1);
			}
			if(max<arr[i])
				max = arr[i];
		}
		return max;
	}

}
