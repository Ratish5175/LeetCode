package stack;

import java.util.Stack;

public class MaxRectangle {

	
	public static int largestRectangleArea(int[] heights) {
        
		int max_area =-1;
		Stack<Integer> stack = new Stack<Integer>();
		int top =0;
		int i =0;
		for(;i<heights.length;) {
			
			if(stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
				stack.push(i++);
				
			}
			else if((heights[stack.peek()]>heights[i]))
			{
				
				top = stack.peek();
				stack.pop();
				int temp = heights[top]*(stack.empty() ? i :  
                    i - stack.peek() - 1); 
				if(temp>max_area)
					max_area = temp;
			}
		}
		
		while(!stack.isEmpty()) {
			top = stack.peek();
			stack.pop();
			int temp = heights[top]*(stack.empty() ? i :  
                i - stack.peek() - 1); 
			if(temp>max_area)
				max_area = temp;
		
		}
		return max_area;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []arr = {1,1};
		
		System.out.print(MaxRectangle.largestRectangleArea(arr));
	}

}
