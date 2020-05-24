import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomizedSet {

	/*
	 * 
	 * ["RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom"]
		[[],[1],[2],[2],[],[1],[2],[]]
		
		["RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom"]
		[[],[1],[2],[2],[],[1],[2],[]]
		
		["RandomizedSet","insert","insert","remove","insert","remove","getRandom"]
		[[],[0],[1],[0],[2],[1],[]]
	 * 
	 * 
	 * 
	 * ["RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom"]
		[[],[1],[2],[2],[],[1],[2],[]]
	 * 
	 * 
	 * ["RandomizedSet","insert","insert","remove","insert","remove","getRandom"]
	  [[],[0],[1],[0],[2],[1],[]]
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RandomizedSet randomizedSet = new RandomizedSet();
		System.out.println(randomizedSet.insert(0));
		
		System.out.println(randomizedSet.insert(1));
		
		System.out.println(randomizedSet.remove(0));
		System.out.println(randomizedSet.insert(2));
		
		System.out.println(randomizedSet.remove(1));
		System.out.println(randomizedSet.getRandom());
//		System.out.println(randomizedSet.insert(2));
//		System.out.println(randomizedSet.getRandom());
		
	}

	    /** Initialize your data structure here. */
	    HashMap<Integer,Integer> master;
	    HashMap<Integer,Integer> lookupArray;
	    int[] arr;
	    List<Integer> ar ;
	    int ind;
	    Random rand;
	    public RandomizedSet() {
	        arr=  new int [100];
	        ar =  new LinkedList<Integer>();
	        rand = new Random(); 
	        master = new HashMap<Integer,Integer>();
	        lookupArray = new HashMap<Integer,Integer>();
	        ind =0;
	    }
	    
	    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
	    public boolean insert(int val) {
	        if(master.get(val)==null){
	         //   arr[ind]=val;
	            ar.add(val);
	            master.put(val, 1);
	            lookupArray.put(val,ar.size()-1);
	       
	            return true;
	        }
	        return false;
	    }
	    
	    /** Removes a value from the set. Returns true if the set contained the specified element. */
	    public boolean remove(int val) {
	        if(master.get(val)!=null){
	            master.remove(val);
	 //           arr.remove(lookupArray.get(val));
	            
//	            arr.remove(lookupArray.get(val));
//	            arr.add(lookupArray.get(val), lookupArray.get(ind--));
	            //ar.remove(lookupArray.get(val));
	            int index = lookupArray.get(val) ;
	            ar.remove(index);
	            //arr[lookupArray.get(val)] = arr[ind-1];
	            
	            //arr.add(lookupArray.get(val),arr.get(ind-1));
	            
	            lookupArray.remove(val);
	            return true;
	        }
	            return false;
	    }
	    
	    /** Get a random element from the set. */
	    public int getRandom() {
	       return   ar.get(rand.nextInt(ar.size()));
	    }
	
}
