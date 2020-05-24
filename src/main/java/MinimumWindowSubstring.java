import java.util.HashMap;
import java.util.HashSet;

public class MinimumWindowSubstring {

	public static void main(String[] args) {
		
		String s="BBA";
		String t = "AB";
		MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
		System.out.print(minimumWindowSubstring.minWindow(s, t));

	}
	int best =Integer.MAX_VALUE;
	int start = 0;
	int end = 0;
	HashMap<Character,Integer> lookup = new HashMap<Character,Integer>();
	
	
	 public boolean CheckWindow(String s , int l ,int r, int val) {
		 
		 HashSet<String> local = new HashSet<String>();
		 int c=0;
		 for(int i=l;i<=r;i++) {
			if(lookup.get(s.charAt(i))!=null  && !local.contains(s.charAt(i)+"")) {
				local.add(s.charAt(i)+"");
				c++;
			}
		 }
		 
		
		 if(c== val) {
			 if(best > r-l+1 ) {
				 best = r-l+1;
				 start = l;
				 end = r;
			 }
			 return true;
		 }
			 
		 else
			 return false;
	 }
	 public String minWindow(String s, String t) {
		 int n = t.length() ;
		 for(int i=0;i<n;i++) {
			 if(lookup.get(t.charAt(i))==null)
				 lookup.put(t.charAt(i), 0);
			 else
				 lookup.put(t.charAt(i), lookup.get(t.charAt(i))+1);
		 }
		 
		 int l=0;
		 int r=n-1;
		 while(r<s.length()) {
			 
		
			 int i = l;
			 int j = r ;
			 while(j<s.length()) {
				 if(CheckWindow(s, i, j,n))
				 {
					 return s.substring(start, end+1);
				 }
				 i++;
				 j++;
			 }
			 r++;
			 
		 }
		 return "";
	 }
}
