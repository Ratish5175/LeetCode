import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
		ThreeSum threeSum1 = new ThreeSum();
		threeSum1.threeSum(nums);
	}

    public List<List<Integer>> threeSum(int[] nums) {
        
    	 List<List<Integer>> res = new ArrayList<List<Integer>>();
     	HashSet<List<Integer>> resUtil = new HashSet<List<Integer>>();
     	Arrays.sort(nums);
     	
     	int start = 0;
     	int end = nums.length-1;
     	int mid = start +1;
     	int sum =0;
     	while(start<=nums.length-1) {
     		
     		while(mid<end) {
     			ArrayList<Integer> out = new ArrayList<Integer>();
     			sum = 0-nums[start];
     			
     			if(sum==nums[mid]+nums[end]) {
     				out.add(nums[start]);
     				out.add(nums[mid]);
     				out.add(nums[end]);
     				resUtil.add(out);
     				end--;
     			}
     			else if(sum>nums[mid]+nums[end])
                     mid++;
     			else
     				end--;
     		}
     		
     			start++;
          		mid = start +1;
          		end = nums.length-1;
     			
     	}
     	res.addAll(resUtil);
//     	for(List<Integer> b :resUtil) {
//     		res.add(b);
//     	}
     	return res;
    }
}
