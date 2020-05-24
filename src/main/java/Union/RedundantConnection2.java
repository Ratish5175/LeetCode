package Union;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RedundantConnection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] edges =  {{1,2}, {2,3}, {3,4}, {4,1}, {1,5}};
		RedundantConnection2 redundantConnection2 = new RedundantConnection2();
		System.out.print(redundantConnection2.findRedundantDirectedConnection(edges));
	}

	public int[] findRedundantDirectedConnection(int[][] edges) {
		
		Set<Integer> lookup = new TreeSet<Integer>();
		HashMap<Integer, Integer> indegree = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		int[] res = new int[2];

		for(int i=0;i<edges.length;i++)
		{
			if(lookup.contains(edges[i][0]) && lookup.contains(edges[i][1])) {
				
				res[0]=edges[i][0];
				res[1]=edges[i][1];
				if(count.get(edges[i][0])==null)
					count.put(edges[i][0],1);
				else
					count.put(edges[i][0],count.get(edges[i][0])+1);
				
				if(count.get(edges[i][1])==null)
					count.put(edges[i][1],1);
				else
					count.put(edges[i][1],count.get(edges[i][1])+1);
				
				if(count.get(edges[i][0])>1 && (indegree.get(edges[i][1])>1
						||indegree.get(edges[i][0])>1)) {
					
				}
			}
			else
			{
				lookup.add(edges[i][0]);
				lookup.add(edges[i][1]);
				if(indegree.get(edges[i][1])==null)
					indegree.put(edges[i][1], 1);
				else
					indegree.put(edges[i][1], indegree.get(edges[i][1])+1);
			}
		}
	
		return res;
	}
}
