import java.util.Arrays;

public class RegexMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		"ab"
//		".*c"
		String p = "aa";
		String s = ".*";
		
		RegexMatching regexMatching = new RegexMatching();
		System.out.println(regexMatching.isMatch(s, p));
	}

	
	public boolean isMatch(String s , String p)
	{
		int r = s.length();
		int c = p.length();
		boolean [][]dp = new boolean [r+1][c+1];
		dp[0][0] = true;
		
		
		for(int i =1;i<r;i++) {
			for(int j=1;j<c;j++) {
				if(s.charAt(i) == p.charAt(j) || p.charAt(j)=='.') 					
						dp[i][j] = dp[i-1][j-1];
				else if(p.charAt(j)=='*' && p.charAt(j-1)==s.charAt(i)) {
						dp[i][j] = dp[i-1][j-2]|dp[i-1][j];					
				}
				else
					dp[i][j]= false;
			}
		}	
		
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		return dp[r-1][c-1];
	}
//	public boolean isMatch(String s, String p) {
//		
//		char[] word = s.toCharArray();
//		char[] pattern = p.toCharArray();
//		char[] matcherWord = new char[10000];
//		int c =0;
//		int k =0;
//		
//		for(int i=0;i<pattern.length;i++) {
//			if(pattern[i]=='.'  && pattern[i+1]!='*') {
//				matcherWord[c++]= word[k++];
//			}
//			else if (pattern[i]=='*')
//			{
//				if(pattern[i-1]=='.')
//					{
//						for(int j=k;k < word.length  && word[j]==word[k];) {
//							matcherWord[c++] = word[k++];
//						}
//					//	matcherWord[c++]=word[k++];					
//					}
//				else
//				{
//					for(int j=i;k < word.length  && word[k]==pattern[i-1];j++) {
//						matcherWord[c++] = word[k++];
//					}
//				}
//			}
//			else if (i+1 < pattern.length && pattern[i+1]=='*') {
//				for(int j=i;k < word.length  && word[k]==pattern[i];j++) {
//					matcherWord[c++] = word[k++];
//				}
//			}
//			else if(pattern[i] == word[k]) {
//				matcherWord[c++] = word[k++];
//			}
//		}
//		
//		char[] w = new char[c];
//		for(int i=0;i<c;i++)
//			w[i]=matcherWord[i];
//			
//		return Arrays.equals(w,word);
//		
//	}
//	
	
}
