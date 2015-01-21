package com.mak.treesnGraphs;

public class DiGraphDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiGraph test= new DiGraph();
		test.addNode(1,-1 ,0);
		test.addNode(1, 2, 4);
		test.addNode(1, 3, 3);
		test.addNode(1, 4, 2);
		test.addNode(1, 5, 1);
		test.addEdge(5, 1, 10);
		test.addEdge(5, 2, 5);
		test.printGraph();
		
	}

}
