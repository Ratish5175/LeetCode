package RCV;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class UniqueFrequency {

	public boolean uniqueOccurrences(int[] arr) {
		
		HashMap<Integer, Integer> res = new HashMap<Integer, Integer>();

		for( int i =0;i< arr.length; i++) {
			res.putIfAbsent(arr[i], 0);
			res.put(arr[i], res.get(arr[i])+1);
		}
		
		int [] crr = new int[res.values().size()];
		Arrays.fill(crr, 0);int c=0;
		for(int i :res.values())
		{
			crr[c++]=i ;
		}
		Arrays.sort(crr);
		for(int i = 0 ;i< crr.length-1;i++)
		{
			if(crr[i]==crr[i+1] && crr[i]!=0)
				return false ;
		}
		
	
		
		
		return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueFrequency uniqueFrequency = new UniqueFrequency();
		
		int [] arr= {26,2,16,16,5,5,26,2,5,20,20,5,2,20,2,2,20,2,16,20,16,17,16,2,16,20,26,16};
		System.out.println(uniqueFrequency.uniqueOccurrences(arr));
	}

}
