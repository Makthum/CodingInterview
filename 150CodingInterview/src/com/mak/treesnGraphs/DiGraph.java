package com.mak.treesnGraphs;

import java.lang.reflect.Array;
import java.util.*;

public class DiGraph {
    
    //Hashmap of vertices and its neighbours
    public HashMap<Node,ArrayList<DiEdge>> adjacencyList;
  
    // Set containing all vertices in the Graph;
    public Set<Node> vertices;

    // Constructor
    public DiGraph(){
	this.adjacencyList=new HashMap<Node, ArrayList<DiEdge>>();
	this.vertices= new HashSet<Node>();
    }

    //Add a node. When Graph is empty dest node can be null if not dest node shud be not null. Provide dest as -1 if null
    
    public boolean addNode(int srcval,int destval,int weight) {
    
    //Graph is empty. Hence add src node to start with 
    if(destval==-1) {
	Node firstNode= new Node(srcval);
        this.vertices.add(firstNode);
        
  	//Add the vertex to the adjacency List
	this.adjacencyList.put(firstNode,null);
	return true;
    }else {
	Node srcNode= new Node(srcval);
	Node destNode=new Node(destval);
	
	//retrieve its neighbours list 
	ArrayList<DiEdge> neighbours=this.adjacencyList.get(srcNode);

	if(neighbours==null) {	
	    //if list is not created . Create List
	    neighbours=new ArrayList<DiEdge>();
	}
	    //Create an DiEdge from source Node to dest Node 
            DiEdge edge= new DiEdge(destNode,weight);
 	    neighbours.add(edge);
	
	// Add dest Node to vertices set 
	this.vertices.add(destNode);
	
	//Add its neighbours to adjacency List
	this.adjacencyList.put(srcNode,neighbours);
	return true;
     }
    }
    
    /**
     * This method adds an edge between two nodes
     * In order to add directed edge both nodes needs to be present.
     */
    public boolean addEdge(int srcval,int destval,int weight){
    	
    	//create src and dest nodes
    	Node src= new Node(srcval);
    	Node dest= new Node(destval);
    	
    	//check if both the nodes are present 
    	
    	if(!vertices.contains(src) || !vertices.contains(dest)){
    		return false;
    	}else{
    		//create directed Edge
    		DiEdge edge= new DiEdge(dest,weight);
    		
    		//Add this edge to neighbours of src node 
    		ArrayList<DiEdge> neighbours=this.adjacencyList.get(src);
    		
    		//if list is empty 
    		if(neighbours==null){
    			neighbours= new ArrayList<DiEdge>();
    		}
    		
    		//add edge 
    		neighbours.add(edge);
    		
    		//add to adjacency List
    		this.adjacencyList.put(src, neighbours);
    		return true;
    	}
    }
    
    public void printGraph(){
    	for(Node node:this.vertices){
    		ArrayList<DiEdge> neighbours=this.adjacencyList.get(node);
    		System.out.println(node.getData());
    		if(neighbours!=null){
	    		for(DiEdge diedge:neighbours){
	    			System.out.print("--"+diedge.getWeight()+"-->"+diedge.getVertex().getData());
	    		}
	    		System.out.println("");
    		}
    	}
    }
}
