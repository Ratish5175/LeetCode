package stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ValidParenthesis {

	ArrayList<Character> list = new ArrayList();
	public void foo ( char [] arr, int i )
	{
		char temp=' ';
	    if(i<arr.length-1)
	    {
	       // print (arr);
	    	System.out.println();
//	        if(isValid(arr))
//	        {
//	        	for(char a : arr) {
//	             list.add(a);
//	           //  System.out.print(a);
//	        	}
//	             System.out.println();
//	        	list.add('#');
//	        }
	        for(int j=i+1;j<arr.length;j++) {
	        	//foo(arr , j);
	        	temp = arr[i];
		       arr[i]= arr[j];
		       arr[j] = temp;
		       print(arr);
		       foo(arr , j);
	        }
	         
	    }
	    return;
	}
	private void print(char[] arr) {
		// TODO Auto-generated method stub
	 	for(char a : arr) {
            list.add(a);
            System.out.print(a);
       	}
	 	System.out.print("\n");
	}
	public boolean isValid(char[] str) {
        
		Stack<Character> st = new Stack<Character>();

		int i=0;
		//st.push(str[0]);
		for(i=0;i<str.length;i++)
		{
			
			if(!st.isEmpty() &&
					(st.peek() == '(' && str[i]==')'
				||
				st.peek() == '{' && str[i]=='}'||
				st.peek() == '[' && str[i]==']'
					))
				st.pop();
			else
				st.push(str[i]);
		}
		if(st.isEmpty())
			return true;
		else
			return false;
    }
	public static void main(String[] args)
	{
		String s = "1234";
		char str[] = s.toCharArray();
		ValidParenthesis validParenthesis = new ValidParenthesis();
		//System.out.print(validParenthesis.isValid(str));
		for(int i=0 ;i<str.length;i++) {
			validParenthesis.foo(str, i);
		}
	}
}
