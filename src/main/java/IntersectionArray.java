import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionArray {

	
	public int[] intersect(int[] nums1, int[] nums2) {
     
		//int []arr = new int[Math.min(nums1.length, nums2.length)] ; 
		ArrayList<Integer> arr  = new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int start1 =0;
		int start2 =0;
		int c=0;
		while(start1<nums1.length && start2<nums2.length) {
			if(nums1[start1] <nums2[start2]) {
				start1++;
			}
			else if(nums1[start1] > nums2[start2]) {
				start2++;
			}
			else {
				arr.add( nums1[start1]);
				start1++;
				start2++;
			}
		}
		int [] brr = new int [arr.size()];
		for(int a: arr)
			brr[c++]=a;
		return brr;
    }
	public static void main(String[] args)
	{
		int [] nums1 = {1,2,2,1};
		int []nums2 = {2,2};
		IntersectionArray intersectionArray = new IntersectionArray();
		int [] arr = intersectionArray.intersect(nums1, nums2);
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
	}
}
