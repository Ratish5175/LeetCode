package stack;

import java.util.Stack;

public class NextMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {17,18,5,4,6,1};
		NextMax nextMax = new NextMax();
		nextMax.replaceElements(arr);
	}

	
	public int[] replaceElements(int[] arr) {
        Stack<Integer> stk = new Stack<Integer>();
        
      
        for(int i =0;i< arr.length;i++){
            
            
    
                if(!stk.isEmpty() && stk.peek()>arr[i])
                    stk.push(arr[i]);
                else{
                    int c=0;
                    while(!stk.isEmpty() &&stk.peek()<arr[i])
                    {
                           stk.pop();   
                            c++;
                           
                    }  
                   // if(c==0) {
                    	stk.push(arr[i]);
//                    	if(stk.lastIndexOf(arr[i])==i)
//                    	{
//                    		stk.push(Integer.MIN_VALUE);
//                    	}
                    //}
                    while(c>0) {
                    	
                    	stk.push(arr[i]);
                        c--;
                    }
                        
                    }
                }
        int [] res = new int[arr.length];
        int c=0;
        res[0]=-1;
    for(Integer i : stk)
        res[++c]= i;
   
   for(int i=0; i<res.length/2; i++){
            int temp = res[i];
            res[i] = res[res.length -i -1];
            res[res.length -i -1] = temp;
        }
 
    return res;
        
    }

}
