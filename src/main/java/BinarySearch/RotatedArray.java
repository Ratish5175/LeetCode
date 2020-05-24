package BinarySearch;

public class RotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//[4,5,6,7,0,1,2]
		//0
		
		int [] nums = {4,5,6,7,8};
		RotatedArray rotatedArray = new RotatedArray();
		System.out.println(rotatedArray.search(nums,0));
	}

	public int bSearch(int [] nums , int target, int left , int right ) {
		
	 int mid =0;
	 while(left<=right) {
		 mid = left + (right - left )/2;
		 if(nums[mid]== target)
			 return mid;
		 else if( nums[mid] > target)
			 right = mid-1;
		 
		 else {
			 left = mid+1;	 
		 }
	 }
	 return -1;
 
	}
	public int search(int[] nums, int i) {
		
	 int left =0;
	 int right = nums.length-1;
	 int mid =0;
	 while(left<right) {
		 mid = left + (right - left )/2;
		 if( nums[mid] > nums [right])
			 left = mid+1;
		 else {
			 right = mid;
		 }
	 }
			 
		// left will point to the smallest number 
	 
	 int a = bSearch(nums,i, 0 ,left);
	 int b = bSearch(nums, i, left,nums.length -1);
	 if(a!=-1)
		 return a;
	 else if(b!=-1)
		 return b;
	 
	 
	 
		return -1;
	}

	
	
	 
}
