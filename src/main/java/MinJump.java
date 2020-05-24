import java.util.Arrays;

public class MinJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinJump minJump= new MinJump();
		int nums[] = {9,7,9,4,8,1,6,1,5,6,2,1,7,9,0};
		System.out.print(minJump.jump(nums));
	}
    public boolean canJump(int[] nums) {
        int [] arr = new int [nums.length];
         arr[0]=0;
         for(int i=1;i<nums.length;i++)
             arr[i]= Integer.MAX_VALUE;
         for(int j=1;j<nums.length;j++){
             for(int i=0;i<j;i++){
                 if(j-i <= nums[i])
                     arr[j] = Math.min(arr[i]+1,arr[j]);
             }
         }
         if(arr[nums.length -1 ]!= Integer.MAX_VALUE && arr[nums.length-1]<0)
             return true;
         else
             return false;
     }
    
    public int jump(int[] nums) {
        int [] dp = new int [nums.length];
        if(nums.length ==1 )
        	return 1;
       Arrays.fill(dp, Integer.MAX_VALUE);
       dp[0]=0;
       int max_marked_index=0;
       int max_value=0;
       for(int j=0;j<nums.length;j++){
         //  for(int i=0;i<j;i++){
          //     if(j-i <= nums[i])
            //       arr[j] = Math.min(arr[i]+1,arr[j]);
        //   }
           
           // max_value=Math.max(max_value, i + nums[i]);
           // if (max_value <= i) {
           //     return 
           // }
           
           
           if(j<max_marked_index){
               dp[j] =Math.min(dp[j], max_value);
           }
               if(nums[j]+j>= nums.length)
               {
            	   dp[nums.length-1] = Math.min(dp[nums.length-1], max_value+1);
               
            	   break;
               }
           dp[nums[j]+j] = Math.min(dp[j]+1 , dp[nums[j]+j]);
           if(max_marked_index<nums[j]+j)
        	   {
        	   		max_marked_index= nums[j]+j;
        	   		max_value = dp[nums[j]+j];
        	   }
            
           
       }
      return dp[nums.length-1];
   }
}
