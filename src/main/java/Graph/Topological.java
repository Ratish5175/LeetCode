package Graph;

//A Java program to print topological sorting of a DAG 
import java.io.*; 
import java.util.*; 

//This class represents a directed graph using adjacency 
//list representation 
class Topological 
{ 
 private int V;   // No. of vertices 
 private LinkedList<Integer> adj[]; // Adjacency List 

 private HashMap<String, Boolean> visit = new HashMap<String, Boolean>();
 private HashMap<String, LinkedList<String>> adjList;
 //Constructor 
 Topological(int v) 
 { 
     V = v;
     adjList = new HashMap<String, LinkedList<String>>();
     adj = new LinkedList[v]; 
     for (int i=0; i<v; ++i) {
         adj[i] = new LinkedList();
     }
 } 

 // Function to add an edge into the graph 
 void addEdge(int v,int w) { adj[v].add(w); 
 
 } 
 public void addEdgeString(String v, String w) {
	 LinkedList<String> temp =null;
	 if(adjList.get(w)==null)
		 temp= new LinkedList<String>();
	 else
		 temp = adjList.get(w);
	 temp.add(v);
	 adjList.put(w, temp);
 }

 // A recursive function used by topologicalSort 
 void topologicalSortUtil(String v, 
                          Stack stack) 
 { 
     // Mark the current node as visited. 
     visit.put(v,  true);//[v] = true; 
    
     String w;
     // Recur for all the vertices adjacent to this 
     // vertex 
     if(adjList.get(v)!=null)
     {
    	 Iterator<String> it = adjList.get(v).iterator(); 
     
	     while (it.hasNext()) 
	     { 
	         w = it.next(); 
	         if (!visit.get(w)) 
	             topologicalSortUtil(w, stack); 
	     }
     }

     // Push current vertex to stack which stores result 
     stack.push(new String(v)); 
 } 

 // The function to do Topological Sort. It uses 
 // recursive topologicalSortUtil() 
 void topologicalSort() 
 { 
     Stack stack = new Stack(); 

     // Mark all the vertices as not visited 
  

     for(String a: adjList.keySet()) {
			
			visit.put(a, false);
			for(String b: adjList.get(a))
				visit.put(b, false);
		}
		
     // Call the recursive helper function to store 
     // Topological Sort starting from all vertices 
     // one by one 
     for (String a: visit.keySet()) 
         if (visit.get(a) == false) 
             topologicalSortUtil(a, stack); 

     // Print contents of stack 
     while (stack.empty()==false) 
         System.out.print(stack.pop() + " "); 
 } 

 // Driver method 
 public static void main(String args[]) 
 { 
     // Create a graph given in the above diagram 
     Topological g = new Topological(6); 
//     g.addEdge(4, 0); 
//     g.addEdge(4, 1); 
//     g.addEdge(2, 3); 
//     g.addEdge(3, 1); 
//     g.addEdge(5, 2); 
//     g.addEdge(5, 0); 

     	
     g.addEdgeString("A", "B"); 
     g.addEdgeString("A","C"); 
     g.addEdgeString("A", "D"); 
     g.addEdgeString("B", "E"); 
     g.addEdgeString("B", "F"); 
     g.addEdgeString("C", "D");
     g.addEdgeString("C", "G");
     g.addEdgeString("D", "G");
     g.addEdgeString("D", "H");
     g.addEdgeString("E", "F");
     g.addEdgeString("E", "H");
     
     g.topologicalSort(); 
 } 
} 