import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RGBOrder {

	
	public static void main(String [] args)
	{
		//0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1
		char [] a= {'B','B','R','B','G','B'};
		order(a);
	}

	private static void order(char[] a) {
		
		
		int start =0;
		int end = a.length-1;
		int mid = start+1;
		
		reorder(start,mid,end,a);
		
		for(char s :a)
			System.out.print(s+",");
	}
	static void reorder(int start , int mid, int end ,char[] a)
	{
		while (mid <= end ) {
			
			if(a[mid] == 'R')
				mid++;
			else if(a[mid]=='B')
			{
				swap(a,start,mid);
				start++;
			}
			else if (a[mid]=='G')
			{
				swap(a,mid,end);
				end--;
			}
			
			if(start== mid) {
				mid=start+1;
			}
		}
	}

	private static void swap(char[]arr , int a, int b) {
		// TODO Auto-generated method stub
		
		char temp = arr[a];
		arr[a]= arr[b];
		arr[b]= temp;
	}
}
