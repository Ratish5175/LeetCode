package BackTracking;

public class PartitonKSubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] nums = {4, 3, 2, 3, 5, 2, 1};
		int k= 4;
		PartitonKSubSet partitonKSubSet = new PartitonKSubSet();
		partitonKSubSet.canPartitionKSubsets(nums, k);
	}
	
	
	public boolean canPartitionKSubsets(int[] nums, int k) {
        int s =0;
        int n = nums.length;
        boolean [] visited  = new boolean [n] ;
        for(int i:nums)s+=i;
        
        if(s%k!=0)
            return false;
        
        return foo(nums,0,k,visited,0,s/k);
    }
    
    public boolean foo(int [] nums, int i, int k , boolean[] used ,int curr , int  target){
        
        if(target ==curr )
        {
            foo(nums, i , k-1,used,0,target);
        }
        else
        {
            for(int j=i;j<nums.length;j++){
                used[j]= true;
                foo(nums, j+1 , k,used,curr+ nums[j],target);
                used[j]= false;
            }
        }
        if(k==1)
            return true;
        return false;
        
    }


}
