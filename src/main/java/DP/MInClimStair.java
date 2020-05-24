package DP;

public class MInClimStair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] cost= {0,1,1,0};
		MInClimStair mInClimStair = new MInClimStair();
		System.out.print(mInClimStair.minCostClimbingStairs(cost));
	}

	 public int minCostClimbingStairs(int[] cost) {
	        Integer [] res = new Integer[cost.length];
	       
	        if(cost.length==0)
	            return 0;
	        else if(cost.length==1)
	            return cost[0];
	        else if (cost.length ==2)
	            return Math.min(cost[0], cost[1]);
	        int sum = Math.min(cost[0], cost[1]); 
	        
	        res[0] = cost[0];
	        res[1] = sum; 
	        
	        for(int i=2;i<cost.length-1;)
	        {
	            if(cost[i]<cost[i+1])
	            {
	                res[i] =res[i-1]+cost[i];
	                i++;
	            }
	            else
	            {
	            	 res[i] =res[i-1]+cost[i+1];
	                    i=i+2;
	            }
	            
	        }
	        return res[cost.length-2];
	    }
}
