package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharacterByFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SortCharacterByFreq sortCharacterByFreq = new SortCharacterByFreq();
		String res = sortCharacterByFreq.frequencySort("tree");
		for(int i=0;i<res.length();i++) {
			System.out.println(res.charAt(i));
		}
	}

	
	public String frequencySort(String nums) {
        
       
		String res = "";
		 HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
		 for(int i=0;i<nums.length();i++) {
	        	freqMap.put(nums.charAt(i),freqMap.getOrDefault(nums.charAt(i), 0)+1);
	        }
		  
		 PriorityQueue<Character> lookup =
		            new PriorityQueue<Character>((n1, n2) -> freqMap.get(n2) - freqMap.get(n1));
		
		 
	      
	        for(Character a :freqMap.keySet())
	        {
	        	lookup.offer(a);
	        }
	        
	        while(!lookup.isEmpty()) {
	        	int freq = freqMap.get(lookup.peek());
               char st= lookup.poll();
               while(freq!=0){
                   res=res+ st;
                   freq--;
               }
               
                   
	        }
	      //  Collections.reverse(res);
	        return res;
	    
   }
}
