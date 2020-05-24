package SlidingWindow;

import java.util.TreeMap;

public class SlidingWindowMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {1,4,2,3};
		SlidingWindowMedian slidingWindowMedian = new SlidingWindowMedian();
		for(double a :slidingWindowMedian.medianSlidingWindow(nums, 4))
		{
			System.out.println(a);
		}
	}
	
	public double[] medianSlidingWindow(int[] nums, int k) {
     
		TreeMap<Integer,Integer> lookup = new TreeMap<Integer, Integer>();
		
		double[] res = new double[nums.length -k+1];
		
		int j=0;
		while(j<k)
		{
			lookup.put(nums[j],lookup.getOrDefault(nums[j], 0)+1);
			j++;
		}
		
		
		int med;
		boolean odd = false;
		if(k%2!=0)
			odd = true;
		int ind =0;
		boolean flag = false;
		for(int i=j;i<nums.length;i++) {
			
			flag = false;
			med =  0;
					int s;
					int c=0;
				for(Integer l : lookup.keySet()) {
					int freq = lookup.get(l);
					if(flag)break;
					while(freq>0) {
						freq--;
						s=l;
						
						if(odd && c==(k/2)) {
							med = s;
							flag = true;
								break;
						}
						else if(!odd && (c==((k/2)-1) || c==(k/2)))
						{
							
							med =med +s; 
						}
						c++;
						if(c>(k/2) ) {
							flag = true;
							break;
						}
					}
				}
				if(odd)
					res[ind++]= med;
				else
					res[ind++]= (double)(med)/2;
		
				
				if(lookup.get(nums[i-k])!=null)
				{
					if(lookup.get(nums[i-k])==1) {
						lookup.remove(nums[i-k]);
					}
					else
						lookup.put(nums[i-k],lookup.get(nums[i-k])-1 );
				
				}
				lookup.put(nums[i],lookup.getOrDefault(nums[i],0 )+1);
			
		}
		
		int s;
		int c=0;
		med=0;
		flag = false;
		for(Integer l : lookup.keySet()) {
			int freq = lookup.get(l);
			if(flag)break;
			while(freq>0) {
				freq--;
				s=l;
				
				if(odd && c==(k/2)) {
					med = s;
					flag = true;
						break;
				}
				else if(!odd && c==((k/2)-1) || c==(k/2))
				{
					
					med =med +s; 
				}
				c++;
				if(c>(k/2) ) {
					flag = true;
					break;
				}
			}
		}
		if(odd)
			res[ind++]= med;
		else
			res[ind++]=(double) (med)/2;
		return res;
		
    }

}
