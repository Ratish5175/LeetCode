class Solution {
 	public boolean isValid(String s) {
        
		Stack<Character> st = new Stack<Character>();
		char [] str = s.toCharArray();
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
}