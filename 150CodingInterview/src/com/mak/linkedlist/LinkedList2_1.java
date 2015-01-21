package com.mak.linkedlist;

public class LinkedList2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lt= new LinkedList();
		lt.addToEnd(14);
		lt.addToEnd(12);
		lt.addToEnd(14);
		lt.addatbegin(12);
		lt.addatbegin(13);
		lt.addatbegin(13);
		lt.addatbegin(12);
		lt.printList();
		LinkedList2_1.removeDuplicates(lt);
		System.out.println("-----------");
		lt.printList();
	}

	public static void removeDuplicates(LinkedList lt){
		//create three temp Nodes 
		Node iterator=lt.head;
		while(iterator!=null){
			Node current=iterator.next;
			Node prev=iterator;
			while(current!=null){
				if(iterator.getData()==current.getData()){
					prev.next=current.next;
					current=current.next;
				}
				else{
					prev=current;
					current=current.next;
				}
			}
			iterator=iterator.next;
		}
	}
}