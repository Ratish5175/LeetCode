package SlidingWindow;

import java.util.Arrays;
import java.util.TreeMap;

public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 
		 * "ab"
			"eidboaoo"
		 */
		String s1="ab";
		String s2 = "a";
		PermutationString ps = new PermutationString();
		System.out.print(ps.checkInclusion(s1, s2));
	}

	public boolean checkInclusion(String s1, String s2) {
		int c=0;
		TreeMap<Character, Integer> lookup = new TreeMap<Character, Integer>();
		
		int j=s1.length();
		int m=0;
		char[] t = s1.toCharArray();
		Arrays.sort(t);
		
		s1= new String(t);
		while(m<j )
		{
			
			lookup.put(s2.charAt(m),lookup.getOrDefault(s2.charAt(m),0 )+1);
			m++;
		}
		for(int i=m;i<s2.length();i++) {
			
			String s="";
				
				for(Character k : lookup.keySet()) {
					int freq = lookup.get(k);
					while(freq>0) {
						freq--;
						s=s+k;
					}
				}
				if(s1.equals(s.trim())) {
					return true;
				}
				
				if(lookup.get(s2.charAt(c))!=null)
				{
					if(lookup.get(s2.charAt(c))==1) {
						lookup.remove(s2.charAt(c));
					}
					else
						lookup.put(s2.charAt(c),lookup.get(s2.charAt(c))-1 );
					c++;
				}
				lookup.put(s2.charAt(i),lookup.getOrDefault(s2.charAt(i),0 )+1);
			
		}
		String s="";
		for(Character k : lookup.keySet()) {
			int freq = lookup.get(k);
			while(freq>0) {
				freq--;
				s=s+k;
			}
		}
		if(s1.equals(s.trim())) {
			return true;
		}
		
		return false;
	}
}
