import java.util.ArrayList;
import java.util.List;

public class BitPowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []  nums = {1,2,3};
		BitPowerSet bitPowerSet = new BitPowerSet();
		bitPowerSet.subsets(nums);
	}

	
	 public List<List<Integer>> subsets(int[] nums) {
	        
	        
		    List<List<Integer>> output = new ArrayList();
		    int n = nums.length;

		    int w=0;
		    for (int i = 0; i < (int)Math.pow(2, n ); i++) {
		         List<Integer> curr = new ArrayList();
		         String bitmask =Integer.toBinaryString(i); 
		         bitmask = String.format("%"+n+"s", Integer.toBinaryString(i)).replace(' ', '0');
		      for (int j = 0; j < bitmask.length(); ++j) {
		        if (bitmask.charAt(j)== '1') curr.add(nums[j]);
		      }
		      output.add(curr);
		    }
		    return output;
		  
	 }
}
