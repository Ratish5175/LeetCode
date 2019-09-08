package RCV;

import java.util.HashMap;

public class TwoSum {

	 public static int[] twoSum(int[] nums, int target) {
		 
		 HashMap<Integer, Integer> test = new HashMap<Integer, Integer>();
		 
		 int end = nums.length -1 ;
		 int [] res= {-1,-1};
		 //2,7,11,15  - 9
		 int ind1 =-1;
		 int ind2 =-1;
		 for(int i=0; i<=end;i++)
		 {
			 if(test.get(nums[i]) == null)
			 {
				 test.put(target - nums[i], i);
			 }
			 else {
				 ind1 = test.get(nums[i]);
				 ind2 = i;
				 break;
			 }
		 }
		 res[0] = ind1 ; 
		 res[1] = ind2;
		return res;
	        
	    }
	 public static void main(String[] args)
	 {
		 int [] arr= {2,11,15,7};
		 int [] res = twoSum(arr, 1);
		 System.out.println(res[0] +" "+ res[1]);
		 }
}
