package stack;

import java.util.Stack;

public class MakeValidParentheisis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="()))((";
		MakeValidParentheisis makeValidParentheisis = new MakeValidParentheisis();
		System.out.println(makeValidParentheisis.minAddToMakeValid(S));
	}
	
    public int minAddToMakeValid(String S) {
     
    	int count =0;
    	Stack<Character> brackets = new Stack<Character>();
    	for (int i=0;i<S.length();i++)
    	{
    		if(S.charAt(i)=='(')
    		{
    			brackets.push(S.charAt(i));
    		}
    		else {
    			if(!brackets.isEmpty() && brackets.peek()=='(')
    				brackets.pop();
    			else
    				brackets.push(S.charAt(i));
    		}
    	}
    	return brackets.size();
    }

}
