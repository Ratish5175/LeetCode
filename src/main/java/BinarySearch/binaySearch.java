package BinarySearch;

import java.util.Arrays;

public class binaySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {2,5,14,10,3,6,8,7,4,11,23,9};
		Arrays.sort(arr);
		binaySearch binaySear = new binaySearch();
		System.out.print(binaySear.foo(arr, 23));
	}
	
	public int foo(int [] arr , int num ) {
		
		
		int l=0;
		int r = arr.length -1;
		while(l<=r)
		{
			int mid = l+ (r-l)/2;
			if(arr[mid]==num ) {
				return mid;
			}
			else if (num > arr[mid]  )				
			{
				l = mid+1;
			}
			else
				r = mid-1;
				
		}
		return -1;
	}

}
