
public class NearestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NearestPalindrome np = new NearestPalindrome();
		System.out.print(np.nearestPalindromic("1213"));
		
	}
	 public String nearestPalindromic(String s) {
	        
		 	
		 
		 	int r=s.length()-1;
	        int l = 0;
	        if(r==0)
	            return String.valueOf(Integer.valueOf(s)-1);
	        char[] str = s.toCharArray();
	        while(l<r){
	            if(str[l]!=str[r]){
	                str[r]=str[l];
	            }
	            l++;
	            r--;
	        }
	        String st = new String(str);
	        return st;
	        
	    }

}
