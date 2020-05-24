package Greedy;

import java.util.HashMap;
import java.util.PriorityQueue;

public class ReduceArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {3,3,3,3,5,5,5,2,2,7};
		ReduceArraySize reduceArraySize = new ReduceArraySize();
		reduceArraySize.minSetSize(arr);
	}

    public int minSetSize(int[] arr) {
     
    	 HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		  for(int a : arr ) {
	        	freqMap.put(a,freqMap.getOrDefault(a, 0)+1);
	        }
		  
		 PriorityQueue<Integer> lookup =
		            new PriorityQueue<Integer>((n1, n2) -> freqMap.get(n2) - freqMap.get(n1));
		
		  
	        for(int a :freqMap.keySet())
	        {
	        	lookup.offer(a);
	        }
		 int n = arr.length;
		 int k =n;
		 int c=0;
		 while(!lookup.isEmpty()) {
			 int s = freqMap.get(lookup.poll());
			 k=k-s;
			 c++;
			 if((k)<=n/2) {
				 break;
			 }
		 }
		 
    	return c;
    }
}
