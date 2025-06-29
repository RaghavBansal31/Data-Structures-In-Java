package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Edge2{
	int source, destination;
	Edge2(int source, int destination){
		this.source = source;
		this.destination = destination;
		
	}
	
}

public class direction {
	
	static class Node{
		int value;
		Node(int value){
			this.value = value;
		}
	}
	
	List<List<Node>> adjList = new ArrayList<>();
	
	public direction(List<Edge2> edge) {
		for(int i = 0;i<edge.size();i++) {
			adjList.add(i, new ArrayList<>());
		}
		
		for(Edge2 e: edge) {
			adjList.get(e.source).add(new Node(e.destination));
			
		}
	}
	
	public static void printGraph(direction graph) {
		int sourceV = 0;
		int listsize = graph.adjList.size();
		
		while(sourceV < listsize) {
			for(Node n: graph.adjList.get(sourceV)) {
				System.out.print(" Vertex:" + sourceV + " ==> " + n.value);
			}
			System.out.println();
			sourceV++;
		}
	}
	

	public static void main(String[] args) {
		List<Edge2> edge =  Arrays.asList(new Edge2(0, 1),new Edge2(0, 2),
                new Edge2(1, 2),new Edge2(2, 0), new Edge2(2, 1),
                new Edge2(3, 2), new Edge2(4, 5),new Edge2(5, 4));
		direction d = new direction(edge);
		printGraph(d);
		

	}

}
