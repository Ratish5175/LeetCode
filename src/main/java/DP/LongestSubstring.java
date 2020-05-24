package DP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class LongestSubstring {

	//abcabcd
	public int GetLongestSubString(String str) {
		if(str.equals("") )
			return 0;
      else if  (str.contains(" ") )
            return 1;
		int count =0;
		int max = Integer.MIN_VALUE;
		int arr [] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
					  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
					  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
					  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
					  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
					  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for (int i =0;i<str.length();i++) {
			if(arr[Integer.valueOf(str.charAt(i))-97]==0)
			{
				arr[Integer.valueOf(str.charAt(i))-97]=1 *10 + i;
				count ++;
				if(max<count )
					max = count ;
				
			}
			else {
				int ind = arr[Integer.valueOf(str.charAt(i))-97]%10;
				for (int j =0;j<=ind;j++) {
					arr[Integer.valueOf(str.charAt(j))-97]=  0;
					count --;
				}
				
				
				
			
				arr[Integer.valueOf(str.charAt(i))-97]=1 *10 + i;
				count ++;
//				for (int j =0;j<=25;j++) {
//					if(arr[j]!=0)count ++;
//				}
				if(max<count )
					max = count ;
			//	count =0;
			}
		}
		count =0;
		for (int j =0;j<=299;j++) {
			if(arr[j]!=0)count ++;
		}
		if(max<count )
			max = count ;
		return max;
	}
	
	public int GetLongestSubStringUsingHM(String str)
	{
		int max = Integer.MIN_VALUE;
		LinkedHashMap<Character,Boolean> hMap = new LinkedHashMap<Character, Boolean>();
		//HashMap<Character,Integer> hMapInd = new HashMap<Character, Boolean>();
		int c=0;
		for (int i =0;i<str.length();i++) {
			if(hMap.get(str.charAt(i))==null) {
				hMap.put(str.charAt(i), true);
				c++;
			}
			else { 
				if(max<c)
					max=c;
				List<Character> test= new LinkedList<Character>();
				test.addAll(hMap.keySet());
			
				for (Character p : test) {
					
				
					if((Character)p!=str.charAt(i))
						{
							hMap.remove((Character)p);
							c--;
						}
					else {
						hMap.remove((Character)p);
						c--;
						break;
					}
				}
				
				
				hMap.put(str.charAt(i), true);
				c++;
			}
		}
		if(c>max)max=c;
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LongestSubstring longestSubstring = new LongestSubstring();
		System.out.print(longestSubstring.GetLongestSubStringUsingHM("dvdf"));
	}

}
