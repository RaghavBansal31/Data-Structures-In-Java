package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFS {
	private LinkedList<Integer>[] adj;
	private int V;
	private int E;
	
	
	public DFS(int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adj = new LinkedList[nodes];
		
		for(int i = 0;i<V;i++) {
			this.adj[i] = new LinkedList<>();
		}
	}
	
	
	public void addEdge(int x, int y) {
		this.adj[x].add(y);
		this.adj[y].add(x);
		E++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " Vertices " + E + " Edges " + "\n");
		for(int v = 0;v<V;v++) {
			sb.append(v + ": ");
			for(int w:adj[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public void dfs(int s) {
		boolean[] visited = new boolean[V];
		Stack<Integer> st = new Stack<>();
		st.push(s);
		
		while(!st.isEmpty()) {
			int output = st.pop();
			while(!visited[output]) {
				visited[output] = true;
				System.out.print(output + " ");
				
				for(int w: adj[output]) {
					
					
					if(!visited[w]) {
						st.push(w);
					}
				}
				
				
				
			}
		}
	
	}
	

	public static void main(String[] args) {
		DFS obj = new DFS(6);
		obj.addEdge(0, 1);
		obj.addEdge(1, 2);
		obj.addEdge(2, 3);
		obj.addEdge(3, 4);
		obj.addEdge(4, 0);
		obj.addEdge(2, 4);
		obj.dfs(0);
		
		

	}

}