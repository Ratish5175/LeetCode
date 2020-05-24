import java.util.Arrays;

public class KthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {3,2,1,5,6,4};
		KthLargest kthLargest = new KthLargest();
		System.out.println(kthLargest.findKthLargest(nums, 2));
		
	}
	   public int findKthLargest(int[] nums, int k) {
	     Arrays.sort(nums);
	     
	     for(int a : nums)
	    	 System.out.println(a);
	     return (nums[(nums.length-1) -(k-1)]);
	    }
	   //o(Kn)
/*
 * 
 * 
 * 
 * 
 * [3,2,3,1,2,4,5,5,6] and k = 4
 * 6 5 5 4 3 3 2 2 1
		Output: 4
 * 
 * 
 */
}
