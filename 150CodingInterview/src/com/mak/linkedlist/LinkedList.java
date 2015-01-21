package com.mak.linkedlist;

public class LinkedList {
	
	Node head;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lt= new LinkedList();
		lt.addToEnd(14);
		lt.addToEnd(12);
		lt.addToEnd(122);
		lt.addatbegin(99);
		lt.printList();
	}
	
    
     
     public boolean addToEnd(int data)
     {
    	 if(this.head!=null)
    	 {
    		 Node temp=this.head;
    		 Node node=new Node(data);
    		 while(temp.next!=null)
    		 {
    			 temp=temp.next;
    		 }
    		 temp.next=node;
    		 return true;
    	 }
    	 else{
    		 Node node=new Node(data);
    		 this.head=node;
    	 }
    	 return false;
    	 
     }
     
     public void printList()
     {
    	 if(this.head!=null)
    	 {
    		 Node temp=this.head;
    		 
    		 while(temp!=null)
    		 {
    			 System.out.println(temp.getData());
    			 temp=temp.next;
    			 
    		 }
    	 }
    	 else
    	 {
    		 System.out.println(" List is empty");
    	 }
     }
     
     public boolean addatbegin(int data)
     {
    	 if(this.head!=null)
    	 {
    		 Node node= new Node(data);
    		 node.next=this.head;
    		 this.head=node;
    		 return true;
    	 }
    	 else
    	 {
    		 Node node=new Node(data);
    		 this.head=node;
    	 }
    	 return false;
     }
    	 }
    
