import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "bcabc";
		/* 0 1 2 3 4 5 6 7
		 * c b a c d c b c
		 * 
		 * 1 2 3 4 5 6 7
		 * b a c d c b c
		 * 
		 * 2 3 4 5 6 7
		 * a c d c b c
		 * 
		 * 2 3 4 6 
		 * a c d b 
		 */
		
		
		RemoveDuplicate removeDuplicate = new 
				RemoveDuplicate();
		System.out.print(removeDuplicate.removeDuplicateLetters(s));
	}

	
	 public String removeDuplicateLetters(String s) {
	        LinkedHashSet <Character> dic = new LinkedHashSet<>();
	        HashMap <Character, Integer> myDic = new HashMap<Character, Integer>();
	        for(int i =0;i<s.length();i++)
	        {
	            if(dic.contains(s.charAt(i))){
	            	
	            	int index = myDic.get(s.charAt(i));
	            	if(s.charAt(i)>s.charAt(index+1)) {
	            		dic.remove(s.charAt(i));
	            		dic.add(s.charAt(i));
	            		myDic.replace(s.charAt(i), i);
	            	}
	            	else
	            	{
	            		//dont add
	            	}
	            }
	            else {
	            	
	            	myDic.put(s.charAt(i),i);
	            	dic.add(s.charAt(i));
	            }
	        }
	          String res = "";     
	       for(Character a : dic) {
	    	   res= res+ a;
	       }
	    	return    res;
	       
	    }
}
