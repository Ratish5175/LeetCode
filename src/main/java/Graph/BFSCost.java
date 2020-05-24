package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = Integer.MAX_VALUE;
		int [][] times = {{1,2,1},{2,3,2},{1,3,2}};
		//int [][] times = {{2,1,1},{2,3,1},{3,4,1}};
		//int [][] times = {{1,2,1},{2,1,3}};
		BFSCost bfsCost = new BFSCost();
		System.out.print(bfsCost.networkDelayTime(times, 3, 1));
	}

	
	

	    public int networkDelayTime(int[][] times, int N, int K) {
	        int [] visited = new int [N+1];
	        List <Integer> temp;
	        HashMap<Integer, List<Integer> > test = new HashMap<Integer,List<Integer>>();
	        HashMap<Integer, Integer > cost = new HashMap<Integer,Integer>();
	        for(int i=0;i<times.length;i++){
	            if(test.get(times[i][0]) == null )
	               {
	                   temp= new ArrayList<Integer>();
	               }
	               else 
	                temp= test.get(times[i][0]);
	            temp.add(times[i][1]);
	            test.put(times[i][0],temp);
	            cost.put(times[i][0],Math.max(times[i][2],cost.getOrDefault(times[i][0],0)));
	        }
	       
	             int sum =0;   
	            Queue< Integer> q = new LinkedList<Integer>();
	            
	            q.add(K);
	            int tSum =0;
	        while(!q.isEmpty()){
	        	tSum=0;
	        	int i = q.remove();
	            if(test.get(i)==null) {
	             visited[i]=1;
	            	continue;
	            }
	            else {
	            	if(visited[i]!=1)
	            	{
	            		
	            		temp = test.get(i);
			            for(Integer j :temp)
			            {
			            	if(visited[j]!=1)
			                {	
			            		tSum= Math.max(cost.get(i),tSum); 		
			                	q.add(j);
			                }
			            	  
			            }   
			            visited[i]=1;
			           
	            	}
	            	
	            }
	            sum +=tSum;
	        }
	                               
	        for(int i=1;i<N+1;i++){
	            if(visited[i]==0)
	                return -1;
	        }
	        
	        return sum;                
	    }
	
}
