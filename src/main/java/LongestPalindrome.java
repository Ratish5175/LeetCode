import java.util.Arrays;
import java.util.HashMap;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LongestPalindrome lPalindrome = new LongestPalindrome();
		
		System.out.print(lPalindrome.reorganizeString("aab"));
	}

	
	 public String reorganizeString(String s) {
	        int start =0;
	        int end = s.length()-1;
	        
	        char[] st = s.toCharArray();
	        Arrays.sort(st);
	        System.out.println(st[0]+st[1]+st[2]);
	        while(start < end ){
	            if(st[start] ==st[start+1]){
	                if(st[start+1] !=st[end]){
	                    char temp = st[start+1];
	                    st[start+1] = st[end];
	                    st[end] = temp;
	                    start++;
	                    end--;    
	                }
	                else
	                {
	                    return "";
	                }
	            }
	            else
	            	start++;
	        }
	        
	        return    new String(st);
	    }
	public int longestPalindrome(String s) {
     char[] st = s.toCharArray();
     st.toString();
		HashMap<Character, Integer> lookUp = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(lookUp.get(s.charAt(i))==null){
				lookUp.put(s.charAt(i), 1);
			}
			else {
				lookUp.put(s.charAt(i), lookUp.get(s.charAt(i))+1);
			}				
		}
		System.out.println(s.length());
		int c =0;
		int cOdd=0;
		int max=0;
		int total =0;
		int odd=0;
		for(int i:lookUp.values()) {
			total+=i;
			if(i%2==0)
				c=c+i;
			else {
				odd+=i;
				cOdd++;
				if(max<i)
					max=i;
			}
		}
		System.out.println(c+odd - cOdd+1);
		return c+max;
    }
}
