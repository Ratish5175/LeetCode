package DP;

public class LongestPalindromicSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LongestPalindromicSubString longestPalindromicSubString = 
				new LongestPalindromicSubString();
		
		String s = "ccd";
		System.out.print(longestPalindromicSubString.longestPalindrome(s));
	}

	public String longestPalindrome(String s) {
        
		  if(s.length()==0 || s.length() ==1)
	            return s;
	        if(s.length()==2 && s.charAt(0)!=s.charAt(1))
	            return s.charAt(0)+"";
	        else if(s.length()==2 && s.charAt(0)==s.charAt(1))
	            return s;
		int [][] arr = new int[s.length()][s.length()];
	
		int max = Integer.MIN_VALUE;
		int best_len=0;
		String res ="";
		int start = 0;
		int end = 0;
		int n = s.length();
		for(int mid =0;mid<n;mid++) {
			int i=1;
			while(mid+i<n && mid-i >=0)
				{
					if(s.charAt(mid+i)!=s.charAt(mid-i)  ) {
						break;
					}
					else
					{
						int len = 2 * i +1;
						if(len>best_len) {
							best_len = len;
							res = s.substring(mid-i, mid+i+1);
						}
					}
					i++;
				}
				
		}

		
		for(int mid =0;mid<n-1;mid++) {
			int i=1;
			while(mid+i<n && mid-i+1 >=0)
				{
					if(s.charAt(mid+i)!=s.charAt(mid-i+1)  ) {
						break;
					}
					else
					{
						int len = 2 * i ;
						if(len>best_len) {
							best_len = len;
							res = s.substring(mid-i+1, len+1);
						}
					}
					i++;
				}
				
		}

			
		return res;
		
    }
}
