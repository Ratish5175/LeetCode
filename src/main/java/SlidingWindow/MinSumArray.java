package SlidingWindow;

public class MinSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min_length=0;
		int [] nums = {2,3,1,2,4,3};
		int s=7;
		int n = nums.length;
		int sum =0;
		int i=0;
		for(i=0;i<n;i++) {
			sum+=nums[i];
			if(sum>=s)
				break;
		}
		
		int r= i;
		int l=0;
		
		while(l<=r && r<n) {
			if(sum >=s) {
				min_length = r-l+1;
				sum =sum - nums [r--];
			}
			else
			{
				sum = sum - nums[l++];
				if(r+1>=n)break;
				sum = sum + nums[++r];				
			}
		}
		System.out.print(min_length);
	}

}
