package BinarySearch;

public class SingleElementSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//            0 1 2 3 4  5  6
		int [] arr = {3,3,7,7,10,10,11,11,12};
		//int [] arr = {1,1,2,2,3};//,3,3,4,4,8,8};
		
		SingleElementSortedArray singleElementSortedArray = new SingleElementSortedArray();
		System.out.print(singleElementSortedArray.search(arr));
	}

	
	// n = odd 
	// We find single digit at x { 1...x-1 } is even {x+1..n-1} even
	// arr[mid]!=arr[mid+1] look right= r = mid+1;
	// arr[mid]==arr[mid+1] l = mid -1;
	private int search(int[] arr) {
		
		int l=0;
		int r = arr.length -1 ; 
		while(l<=r) {
			if(r- l <3)
			return	linear(arr, l ,r);
			int mid = l + (r-l)/2;
			if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1])
				return arr[mid];
			else if( arr[mid] !=arr[mid+1]) {
				r  = mid-2;
			}
			else if( arr[mid] ==arr[mid+1])
					l = mid +2;
		}
		return -1;
	}

	private int linear(int [] nums, int l, int r) {
		int s = nums[l];
		for(int i=l+1;i<=r;i++)
			s=s^nums[i];
		return s;
	}

}
