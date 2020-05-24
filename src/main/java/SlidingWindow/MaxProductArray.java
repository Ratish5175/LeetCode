package SlidingWindow;

public class MaxProductArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {2,3,-4,-5};
		MaxProductArray maxProductArray = new MaxProductArray();
		System.out.print(maxProductArray.maxProduct(nums));
	}
	public int maxProduct(int[] nums) {
	     
		if(nums==null || nums.length==0)return -1;
		int curr_max =nums[0];
		int total_max=nums[0];
		int curr_min = nums[0];
				
		for(int i=1;i<nums.length;i++) {
			int temp = curr_max;
			curr_max =Math.max(Math.max(curr_max * nums [i], curr_min* nums[i]),nums[i]);
			curr_min =Math.min(Math.min(temp * nums [i], curr_min* nums[i]),nums[i]);
			if(total_max<curr_max)total_max=curr_max;
		}
        
        return total_max;
        
        // for(int i=0;i<nums.length;i++){
        //     prod = nums[i];
        //         if(max < prod )
        //             max = prod;
        //     for(int j=i+1;j<nums.length ;j++){
        //         prod = prod*nums[j];
        //         if(max < prod )
        //             max = prod;
        //     }
        // }
      
     //   return max;
    }

}
