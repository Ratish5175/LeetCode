package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestStream {

	PriorityQueue<Integer> lookup = new PriorityQueue<>(new Comparator<Integer>() {
		public int compare(Integer a, Integer b) {
			if(a>b)
				return -1;
			else
				return 1;
		}
	});
	int k;
	public KthLargestStream(int k, int[] nums) {
        for(int a:nums)
        	lookup.add(a);
        int c=0;
        while(c<(nums.length-k)) {
        	lookup.poll();c++;
        }
        
        this.k=k;
    }
    
    public int add(int val) {
    	
    	if(lookup.peek()!=null && lookup.peek()>val) {
    		return lookup.peek();
    	}
    	else {
    		lookup.poll();
    		lookup.offer(val);
    		return lookup.peek();
    	}
          
    }
    
//    final PriorityQueue<Integer> q;
//    final int k;
//
//    public KthLargestStream(int k, int[] a) {
//        this.k = k;
//        q = new PriorityQueue<>(k);
//        for (int n : a)
//            add(n);
//    }
//
//    public int add(int n) {
//        if (q.size() < k)
//            q.offer(n);
//        else if (q.peek() < n) {
//            q.poll();
//            q.offer(n);
//        }
//        return q.peek();
//    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,3,4,7};
		KthLargestStream kthLargestStream = new KthLargestStream(2, nums);
		System.out.println(kthLargestStream.add(-1));
		System.out.println(kthLargestStream.add(1));
		System.out.println(kthLargestStream.add(-2));
		System.out.println(kthLargestStream.add(-4));
		System.out.println(kthLargestStream.add(3));
		
	}

}
