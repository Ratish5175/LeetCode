package RCV;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	 public boolean isAnagram(String s, String t) {
	 
		 char[] a = s.toCharArray();
		 char[] b = t.toCharArray();
		 Arrays.sort(a);
		 Arrays.sort(b);
		 String ac = new String(a);
		 String bc = new String(b);
		 if(ac.equals(bc))
			 return true;
		 
		 return false;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Anagram anagram = new Anagram();
		System.out.println(anagram.isAnagram("rat", "car"));
		System.out.println(anagram.isAnagram("pat", "tap"));
	}

}
