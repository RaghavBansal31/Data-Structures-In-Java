package Graphs;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

class Edge{
	int source, destination, weight;
	Edge(int source, int destination, int weight){
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}
	
}
public class weightedGraph {
	static class Node{
		int value, weight;
		Node(int value, int weight){
			this.value = value;
			this.weight = weight;
		}
		
	}
	
	List<List<Node>>  adjList = new ArrayList<>();
	
	public weightedGraph(List<Edge> edge) {
		for(int i = 0;i<edge.size();i++) {
			adjList.add(i, new ArrayList<>());
		}
		
		for(Edge e: edge) {
			adjList.get(e.source).add(new Node(e.destination,e.weight));
		}
	}
	
	public static void printGraph(weightedGraph graph) {
		int sourceVertex = 0;
		int listSize = graph.adjList.size()	;
		
		while(sourceVertex < listSize) {
			for(Node edge: graph.adjList.get(sourceVertex)) {
				System.out.print("Vertex:" + sourceVertex + " ==> " + edge.value + 
                        " (" + edge.weight + ")\t");
			}
			System.out.println();
            sourceVertex++;
		}
		
	
	}

	public static void main(String[] args) {
		List<Edge> edge = Arrays.asList(new Edge(0, 1, 2),new Edge(0, 2, 4),
                new Edge(1, 2, 4),new Edge(2, 0, 5), new Edge(2, 1, 4),
                new Edge(3, 2, 3), new Edge(4, 5, 1),new Edge(5, 4, 3));
		weightedGraph graph = new weightedGraph(edge);
		
		printGraph(graph);
		

	}

}
