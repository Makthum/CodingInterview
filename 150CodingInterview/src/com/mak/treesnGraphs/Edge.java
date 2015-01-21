package com.mak.treesnGraphs;

public class Edge {
	private Node vertex;

	public Node getVertex() {
		return vertex;
	}

	public void setVertex(Node vertex) {
		this.vertex = vertex;
	}
	
	public Edge(Node dest){
		this.vertex=dest;
	}
}
