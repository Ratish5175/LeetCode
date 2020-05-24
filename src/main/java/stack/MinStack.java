package stack;

public class MinStack {


	    /** initialize your data structure here. */
	    int[] stack;
	    int stkTop =-1;
	    int[] minStack;
	    int minStkTop =-1;
	    public MinStack() {
	        stack = new int[10];
	        minStack = new int[10];
	    }
	    
	    public void push(int x) {
	        stack[++stkTop] = x;
	        if(minStkTop==-1)
	        	minStack[++minStkTop]=x;
	        else
	        {
	        	if(minStack[minStkTop]>x)
	        		minStack[++minStkTop]=x;
	        	else
	        		minStack[++minStkTop]= minStack[minStkTop-1];
	        }
	    }
	    
	    public void pop() {
	    	if(stkTop>=0)
	    		{
	    			stkTop--;
	    			minStkTop--;
	    		}
	    }
	    
	    public int top() {
	        return stack[stkTop];
	    }
	    
	    public int getMin() {
	        return minStack[minStkTop];
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinStack obj = new MinStack();
		obj.push(5);
		obj.push(1);
		obj.push(2);
		obj.push(6);
		obj.pop();
		obj.pop();
	//	obj.pop();
		//obj.pop();
		
		System.out.print(obj.getMin());
		
	}

}
