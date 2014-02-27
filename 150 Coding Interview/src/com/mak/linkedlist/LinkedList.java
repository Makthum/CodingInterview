package com.mak.linkedlist;

public class LinkedList {
	
	Node head;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lt= new LinkedList();
		lt=lt.createList();
		lt.addToEnd(14);
		lt.addToEnd(12);
		lt.addToEnd(122);
		lt.addatbegin(99);
		lt.printList();
	}
	
     public  LinkedList createList()
     {
    	 this.head= new Node();
    	 
    	 return this;
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
    	 return false;
    	 
     }
     
     public void printList()
     {
    	 if(this.head!=null)
    	 {
    		 Node temp=this.head;
    		 
    		 while(temp.next!=null)
    		 {
    			 temp=temp.next;
    			 System.out.println(temp.getData());
    			 
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
    		 node.next=this.head.next;
    		 this.head.next=node;
    		 return true;
    	 }
    	 else
    	 {
    		 return false;
    	 }
     }
    	 }
    
