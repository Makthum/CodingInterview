package com.mak.treesnGraphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Graph {

	public HashMap<Node,ArrayList<Edge>> adjacenyList;
	public Set<Node> nodes;
	
	public Graph(){
		adjacenyList=new HashMap<Node, ArrayList<Edge>>();
		nodes=new HashSet<Node>();
	}
	
	/**
	 * It takes two input and creates the edge between them. Both the nodes shud exist for edge to be created. Else returned false
	 * @param srcval
	 * @param destval
	 * @return
	 */
	public boolean addEdge(int srcval,int destval){
		Node src=new Node(srcval);
		Node dest=new Node(destval);
		if(!nodes.contains(src) || !nodes.contains(dest)){
			return false;
		}else{
			Edge temp=new Edge(dest);
			ArrayList<Edge> tmp=adjacenyList.get(src);
			if(tmp==null){
				tmp=new ArrayList<Edge>();
				adjacenyList.put(src,tmp);
			}
			tmp.add(temp);
			temp=new Edge(src);
			ArrayList<Edge> tmp1=adjacenyList.get(dest);
			if(tmp1==null){
				tmp1=new ArrayList<Edge>();
				adjacenyList.put(dest,tmp1);
			}
			tmp1.add(temp);
			return true;
		}
	}
	
	/**
	 * This Method add a nodes to the graph and creates a edge.
	 * @param src
	 * @param dest
	 * @return
	 */
	public boolean addNodeEdge(int srcval, int destval){
		Node src=new Node(srcval);
		Node dest=new Node(destval);
		if(!nodes.contains(src)){
			return false;
		}else{
			nodes.add(dest);
			
			ArrayList<Edge> e= adjacenyList.get(src);
			if(e==null){
				e= new ArrayList<Edge>();
			}
			Edge ed=new Edge(dest);
			e.add(ed);
			this.adjacenyList.put(src,e);
			ArrayList<Edge> e2= new ArrayList<Edge>();
			Edge e3=new Edge(src);
			e2.add(e3);
			this.adjacenyList.put(dest, e2);
			return true;
		}
	}
	/**
	 * Adds a node and its neighbours to the graph. When the list is empty it adds a empty Node to the graph
	 * @param dest
	 * @param edges
	 * @return
	 */
	public boolean addNode(int destval,ArrayList<Edge> edges){
     		    Node dest=new Node(destval);
  			boolean result=false;
  			if(edges!=null){
				java.util.Iterator<Edge> it=edges.iterator();
				while(it.hasNext()){
					boolean temp=nodes.contains(it.next());
					if(temp){
					   result=true;
					   break;
					}
				}
			    if(result){
			    	nodes.add(dest);
					adjacenyList.put(dest,edges);
			    }
			}
			else{
      		    	nodes.add(dest);
 				adjacenyList.put(dest,null);

			}
		    return result;
	}
	
	
	/**
	 * Prints the values of the graph
	 */
	public void printGraph(){
		for(Node node:this.nodes){
			System.out.println(node.getData());
			ArrayList<Edge> neighbours=getAdjacencyList(node);
			if(neighbours!=null){
				for(Edge edge:neighbours){
					System.out.print("---->"+edge.getVertex().getData());
				}

			}
			System.out.println("\n");
		}
	}
	
	public  ArrayList<Edge> getAdjacencyList(Node node){
		ArrayList<Edge> result=adjacenyList.get(node);
		return result;
	}
	
	/**
	 * Non recursive implementation
	 * @param a
	 * @param b
	 */
	public void DFS(int a,int b){
		Stack<Node> s= new Stack<Node>();
		ArrayList<Integer> visited= new ArrayList<Integer>();
		Node src=new Node(a);
		Node dest= new Node(b);
		s.push(src);
		while(!s.empty()){
			Node tmp=s.pop();
			if(!visited.contains(new Integer(tmp.getData()))){
				System.out.println(tmp.getData());
				visited.add(new Integer(tmp.getData()));
				ArrayList<Edge> etemp=adjacenyList.get(tmp);  
				if(etemp!=null){
					for(Edge edge:etemp){
						if(visited.contains(new Integer(edge.getVertex().getData()))){
							continue;
						}
						s.push(edge.getVertex());
					}
				}
			}
				
		}
	}
}
