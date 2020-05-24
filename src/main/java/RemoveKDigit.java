import java.util.Stack;

public class RemoveKDigit {

	public static void main(String[] args) {
		
		String num ="112";
				//"43214321";
				//"10200";
				//"1432219";
		RemoveKDigit removeKDigit = new RemoveKDigit();
		System.out.print(removeKDigit.removeKdigits(num, 4));
	}

	public String removeKdigits(String num, int k) {
	    String kNum="";
	    Stack<Integer> st = new Stack<Integer>();
		if(k==num.length())
			return "0";
	    int c =0;
	    for(int i= 0 ;i<num.length();i++) {
	    	if(st.isEmpty())
	    		st.push(num.charAt(i)-'0');
	    	else {
	    		while(!st.isEmpty() && st.peek()> num.charAt(i)-'0' && c<k) {
	    			st.pop();
	    			c++;
	    		}
	    		st.push(num.charAt(i)-'0');
	    	}
	    }
	    while(!st.isEmpty()) {
	    	if(c==k)
	    		kNum = kNum +st.pop();
	    	else {
	    		st.pop();
	    		c++;
	    	}
	    }
	    if(kNum.equals(""))
	    	kNum="0";
	    StringBuilder s = new StringBuilder(kNum);
		return String.valueOf(Integer.parseInt(s.reverse().toString()));
    }
}
