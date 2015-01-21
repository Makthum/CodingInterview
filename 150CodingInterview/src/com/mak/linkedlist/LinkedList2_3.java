package com.mak.linkedlist;

public class LinkedList2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lt= new LinkedList();
		lt.addToEnd(14);
		lt.addToEnd(12);
		lt.addatbegin(11);
		lt.addatbegin(10);
		lt.printList();
		Node temp=LinkedList2_3.findNode(lt,11);
		System.out.println("-------------");
		LinkedList2_3.deleteNode(temp);
		lt.printList();
	}
	
	public static void deleteNode(Node node){
		//idea is to copy the contents of adjacent node starting from the given node
		
	    //create temp node 
		if(node!=null){
		Node temp=node;
		Node next=node.next;
		temp.setData(next.getData());
		temp.next=next.next;
		}
	}
	
	public static Node findNode(LinkedList lt,int value){
		Node temp=lt.head;
		while(temp!=null){
			if(temp.getData()==value){
				return temp;
			}
			temp=temp.next;
		}
		return null;
	}
}
