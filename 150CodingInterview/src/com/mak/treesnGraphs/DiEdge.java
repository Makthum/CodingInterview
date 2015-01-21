package com.mak.treesnGraphs;


public class DiEdge{
	private Node vertex;
	private int weight;
	
	public DiEdge(Node node,int weight){
            this.vertex=node;
	    this.weight=weight;
        }
        
        public DiEdge(){
	   this.vertex=null;
 	   this.weight=0;
	}
	
	public void setVertex(Node node){
  	    this.vertex=node;
	}
	
	public Node getVertex(){
	    return this.vertex;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
