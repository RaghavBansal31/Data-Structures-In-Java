package Graphs;

public class Graph {
	
	private int V;
	private int E;
	private int[][] adjMatrix;
	
	public Graph(int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adjMatrix = new int[nodes][nodes];
	}
	
	public void addEdge(int x, int y) {
		this.adjMatrix[x][y] = 1;
		this.adjMatrix[y][x] = 1;
		E++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices " + E + " edges " + "\n");
		for(int v = 0; v < V; v++) {
			sb.append(v + ": ");
			for(int w: adjMatrix[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Graph obj = new Graph(5);
		obj.addEdge(0, 1);
		obj.addEdge(1, 2);
		obj.addEdge(2, 3);
		obj.addEdge(3, 4);
		obj.addEdge(4, 0);
		
		System.out.println(obj);
		

	}

}
