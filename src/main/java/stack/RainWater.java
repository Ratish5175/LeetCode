package stack;

import java.util.Stack;

public class RainWater {

	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		RainWater rainWater = new RainWater();
		System.out.print(rainWater.trap(height));

	}
	 public int trap(int[] height) {
	      int sum =0;
	      
	      int [] leftHighest = new int[height.length+1];
	      leftHighest[0]=0;
	      for(int i=0;i<height.length;i++) {
	    	leftHighest[i+1] = Math.max(leftHighest[i],height[i]);  
	      }
	      int rightHighest =0;
	      for(int i =height.length -1 ;i>=0;i--) {
	    	  rightHighest = Math.max(height[i], rightHighest);
	    	  int t =  Math.min(rightHighest, leftHighest[i]) - height[i];
	    	  if(t>0)
	    		  sum+=t;
	      }
	      
	        return sum;
	    }

}
