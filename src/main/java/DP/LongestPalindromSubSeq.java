package DP;

public class LongestPalindromSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LongestPalindromSubSeq longestPalindromSubSeq = new LongestPalindromSubSeq();
		System.out.println(longestPalindromSubSeq.longestPalindromeSubSeq1("bbbab"));
	}

	public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        
        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                //    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][s.length()-1];
    }
	
	
	
	public int longestPalindromeSubSeq1(String s) {
        
		
		
		int [][] arr = new int[s.length()][s.length()];
	
		int n = s.length();
		int l=0;
		int r =1;
		int max = 0;
		for(int i=0;i<s.length();i++)
		{
			arr[i][i]= 1;
		}
		for(int i=n-1;i>=0;i--) {
			for(int j = i+1;j<n;j++)
			{
				if(s.charAt(i)==s.charAt(j)) {
					arr[i][j] = arr[i+1][j-1]+2;
					
						r=j;
						l=i;
				}
				else arr[i][j]= Math.max(arr[i+1][j],arr[i][j-1]);
								
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j<n;j++) {
				System.out.print(arr[i][j]);	
			}
			System.out.println();
		}
		
		return arr[0][n-1];
		
    }
}
