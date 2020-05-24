package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class DFS {

	private HashMap<String, LinkedList<String>> adjList;
	private Stack<String> outputStack;

	public DFS() {
		adjList = new HashMap<String, LinkedList<String>>();
		outputStack = new Stack<String>();
	}

	public void MarkVisited(String v, HashMap<String, Boolean> visited) {
		outputStack.push(v);
		visited.put(v, true);
	}

	public void Traverse() {
		Stack<String> stack = new Stack<String>();
		HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
		for (String a : adjList.keySet()) {
			visited.put(a, false);
			for (String b : adjList.get(a))
				visited.put(b, false);
		}
		for (String source : adjList.keySet()) {
			if (!visited.get(source)) {

				stack.push(source);
				if (adjList.get(source) != null) {
					for (String item : adjList.get(source))
						stack.push(item);
				}
			}
			while (!stack.isEmpty()) {
				String b = stack.pop();
				if (!visited.get(b)) {
					MarkVisited(b, visited);
					if (adjList.get(b) != null) {
						for (String item : adjList.get(b))
							stack.push(item);
					}
				}
			}
		}
	}

	public void addEdgeString(String v, String w) {
		LinkedList<String> temp = null;
		if (adjList.get(w) == null)
			temp = new LinkedList<String>();
		else
			temp = adjList.get(w);
		temp.add(v);
		adjList.put(w, temp);
	}

	public static void main(String[] args) {
		DFS dfs = new DFS();

		/*
		 * A -> [B, C, D] B -> [E, F] C -> [D, G] D -> [G, H] E -> [F, H]
		 */
		dfs.addEdgeString("A", "B");
		dfs.addEdgeString("A", "C");
		dfs.addEdgeString("A", "D");
		dfs.addEdgeString("B", "E");
		dfs.addEdgeString("B", "F");
		dfs.addEdgeString("C", "D");
		dfs.addEdgeString("C", "G");
		dfs.addEdgeString("D", "G");
		dfs.addEdgeString("D", "H");
		dfs.addEdgeString("E", "F");
		dfs.addEdgeString("E", "H");
		


		dfs.Traverse();
		while (!dfs.outputStack.isEmpty())
			System.out.print(dfs.outputStack.pop() + " ");
	}
}
