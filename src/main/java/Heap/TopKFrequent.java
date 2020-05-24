package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class TopKFrequent {
/*
 * 
 * 
 * [4,1,-1,2,-1,2,3]
2
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopKFrequent topKFrequent1 = new TopKFrequent(); 
		int [] nums = {4,1,-1,2,-1,2,3};
		for(int a : topKFrequent1.topKFrequent(nums, 2)){
			System.out.print(a+" ");	
		}
				
	}
	
	 public List<Integer> topKFrequent1(int[] nums, int k) {
		    // build hash map : character and how often it appears
		    HashMap<Integer, Integer> count = new HashMap();
		    for (int n: nums) {
		      count.put(n, count.getOrDefault(n, 0) + 1);
		    }

		    // init heap 'the less frequent element first'
		    PriorityQueue<Integer> heap =
		            new PriorityQueue<Integer>((n1, n2) -> count.get(n1) - count.get(n2));
		    
		

		    // keep k top frequent elements in the heap
		    for (int n: count.keySet()) {
		      heap.add(n);
		      if (heap.size() > k)
		        heap.poll();
		    }

		    // build output list
		    List<Integer> top_k = new LinkedList();
		    while (!heap.isEmpty())
		      top_k.add(heap.poll());
		    Collections.reverse(top_k);
		    return top_k;
		  }
	
	 public List<Integer> topKFrequent(int[] nums, int k) {
	        
		 List<Integer> res = new ArrayList<Integer>();
		 HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		  for(int a : nums ) {
	        	freqMap.put(a,freqMap.getOrDefault(a, 0)+1);
	        }
		  
		 PriorityQueue<Integer> lookup =
		            new PriorityQueue<Integer>((n1, n2) -> freqMap.get(n1) - freqMap.get(n2));
		
		 
	      
	        for(int a :freqMap.keySet())
	        {
	        	lookup.offer(a);
	        	if(lookup.size()>k)
	        	{
	        		lookup.poll();
	        		//res.add(a);
	        	}
	        	
//	        	else if(lookup.peek()!=null && lookup.peek()<=freqMap.get(a)) {
//	        		
//	        		lookup.offer(freqMap.get(a));
//	        		Collections.sort(res);
//	        		res.remove(0);
//	        		res.add(0, a);
//	        	}	
	        }
	        
	        while(!lookup.isEmpty()) {
	        	res.add(lookup.poll());
	        }
	      //  Collections.reverse(res);
	        return res;
	    }

}
