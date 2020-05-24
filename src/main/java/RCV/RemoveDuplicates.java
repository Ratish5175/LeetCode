package RCV;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class RemoveDuplicates {

	
	    public String removeDuplicateLetters(String s) {
	        
	    	char [] str = s.toCharArray();
	    	//Arrays.sort(str);
	    
	    	HashMap<Character, Integer> duplicate = new HashMap<Character, Integer>();
	    	HashMap<Character, Integer> position = new HashMap<Character, Integer>();
	    	int val = 0;
	    	for(char a : str)
	    	{
	    		if(duplicate.get(a)!=null)
	    		{
	    			val = duplicate.get(a);
	    			duplicate.put(a, ++val);	
	    			
	    		}
	    		else {
	    		duplicate.put(a, 0);
	    		position.put(a, 95-a);
	    		}
	    	}
	    	
	    	Stack<Character> st = new Stack<Character>();

	    	//st.add(str[0]);
	    	for(int i=0;i<str.length;i++)
	    	{
	    		int temp =duplicate.get(str[i]); 
	    		if(temp>1)
	    		{
	    			//delete
	    			st.add(str[i]);
	    			duplicate.put(str[i], --temp);
	    		}
	    		if(!st.peek().equals(str[i+1]))
	    		{
	    			st.add(str[i]);
	    		}	    		
	    	}
	    	String res="";
	    	for(char a : st)
	    	{
	    		res=res+a;
	    	}
	    	return res;
	    			//String.join("", st.toString());
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		
		System.out.println(removeDuplicates.removeDuplicateLetters("cbacdcbc"));
	}

}
