package Union;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {0,-1};
		LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
		System.out.print(longestConsecutiveSequence.longestConsecutive(nums));
	}

	  public int longestConsecutive(int[] nums) {
	        Set<Integer> lookup = new TreeSet<Integer>();
	        int count =0;
	        int max =Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++)
	            lookup.add(nums[i]);
	        for(Integer a : lookup){
	        	if(count>max)
	        		max=count;
	        	if(lookup.contains(a) && lookup.contains(a+1)) {
	            	count ++;
	            }
	        	else
	        	{
	        		count =0;
	        	}
	           
	        }
	        return max+1;
	    }
}
