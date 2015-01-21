package com.mak.treesnGraphs;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g= new Graph();
		g.addNode(1, null);
		g.addNodeEdge(1, 2);
		g.addNodeEdge(1, 3);
		g.addNodeEdge(1, 4);
		g.addNodeEdge(1, 5);
		g.addNodeEdge(3, 7);
		g.addNodeEdge(7, 8);
		g.addNodeEdge(7, 9);
		g.addEdge(2, 3);
		g.addEdge(2, 8);
		g.addEdge(5, 9);
		g.addEdge(2,4);
		g.addEdge(3,5);
		g.printGraph();
		g.DFS(1, 3);
	}

}
