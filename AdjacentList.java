package Graphs;

import java.util.LinkedList;

public class AdjacentList {
	private LinkedList<Integer>[] adj;
	private int V;
	private int E;
	
	
	public AdjacentList(int nodes) {
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

	public static void main(String[] args) {
		AdjacentList obj = new AdjacentList(5);
		obj.addEdge(0, 1);
		obj.addEdge(1, 2);
		obj.addEdge(2, 3);
		obj.addEdge(3, 4);
		obj.addEdge(4, 0);
		System.out.println(obj);
		

	}

}
