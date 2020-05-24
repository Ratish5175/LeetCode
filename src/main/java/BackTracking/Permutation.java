package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Permutation {

	HashSet<ArrayList<Integer>> res= new HashSet<ArrayList<Integer>>();
	ArrayList<Integer> out = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {1,1,3,3};
		Arrays.sort(nums);
		Permutation permutation
		= new Permutation();
		permutation.perm(nums,0);
	}
	
	public void perm(int []nums, int i) {
		if(i==nums.length-1)
			{
				for(int a :nums) {
					out.add(a);
					System.out.print(a);
				}
				System.out.println();
				res.add(out);
				return ;
			}
		else
		{
			for(int j=i;j<nums.length;j++) {
				if(nums[i]!=nums[j] && i!=j) {
					swap(i,j,nums);
					perm(nums,i+1);
					swap(i,j,nums);
				}
				else if(i==j)
				{
					swap(i,j,nums);
					perm(nums,i+1);
					swap(i,j,nums);
				}
			}
		}
	}
	private void swap(int j, int i, int[] nums) {
		// TODO Auto-generated method stub
		int temp = nums[i];
		nums[i]=nums[j];
		nums[j]= temp;
	}

	
//	public static void main(String[] args) 
//	{ 
//		int[] str = {1,2,3}; 
//		int n = str.length; 
//		Permutation permutation = new Permutation(); 
//		permutation.permute(str, 0, n-1); 
//	} 
//
//	private void permute(int[] str, int l, int r) 
//	{ 
//		if (l == r) 
//			System.out.print(str[0]+str[1]+str[2]); 
//		else
//		{ 
//			for (int i = l; i <= r; i++) 
//			{ 
//				swap(str,l,i); 
//				permute(str, l+1, r); 
//				swap(str,l,i); 
//			} 
//		} 
//	} 
//
//	public void swap(int [] a, int i, int j) 
//	{ 
//		int temp; 
//		temp = a[i] ; 
//		a[i] = a[j]; 
//		a[j] = temp; 
//		
//	} 
}
