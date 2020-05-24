
public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 5,8,8,8,8,8,10 };
		int target = 8;
		BinarySearch binarySearch = new BinarySearch();
		System.out.print(binarySearch.search(arr, target));
	}

	private int search(int[] arr, int target) {

		return bin(0, arr.length - 1, target, arr);
	}

	private int bin(int start, int end, int target, int[] arr) {

		int mid = (start + end) / 2;
		

			if (target == arr[mid])
				return mid;
			else if (target < arr[mid]) {
				if(start == mid)
				{
					return mid ;
				}
			return 	bin(start, mid, target, arr);
				
			} else if (target > arr[mid]) {
				if(mid+1 >end)
					return mid+1;
				return bin(mid + 1, end, target, arr);
			}
		
			else
				return -1;
		
		
	}

}
