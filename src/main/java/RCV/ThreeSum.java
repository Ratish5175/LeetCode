package RCV;

import java.util.*;


public class ThreeSum {
	public static Integer[] toObject(int[] intArray) {

		Integer[] result = new Integer[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			result[i] = Integer.valueOf(intArray[i]);
		}
		return result;
	}
	 public static int thirdMax(int[] nums) {
	        
		    
		 	Integer [] localNums = toObject(nums);
		    Arrays.sort(localNums,Collections.reverseOrder());
		  
		 	boolean flag =false;
	        int res =0;
	        int i=0;
	        int count =0;
	        
	        while(i<=localNums.length-1)
	        {
	        	int t1 = localNums[i];
	        	int t2 = localNums[(i+1)%nums.length]; 
	            if(t1!=t2)
	            {
	                count ++;
	            }
	            if(count == 3)
	            {
	                flag = true;
	                res = localNums[i];
	                break;
	            }
	            i++;
	        }
	        if(flag )
	            return res;
	        else
	            return localNums[0];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};
		System.out.println(thirdMax(arr));
	}

}
