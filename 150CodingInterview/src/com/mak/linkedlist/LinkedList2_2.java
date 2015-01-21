package com.mak.linkedlist;

public class LinkedList2_2 {

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
		System.out.println("-------------");
		LinkedList2_2.nthNode(lt, 7);
	}
	
	public static void nthNode(LinkedList lt,int n){
		// idea is to create a window between 1st node and nth node.
		// Then slide the window to the end so that first node of the window points to nth node from last 
		
		//create a window of length N
		int count=0;
		Node wn=lt.head;
		while(count<n){
			if(wn!=null){
				wn=wn.next;
			}
			else{
				System.out.println("N is greater than list size");
				System.exit(0);
			}
			count++;
		}
		
		//Create a iterator Node 
		Node temp=lt.head;
		if(wn==null){
			System.out.println("List exactly has 7 elements. So only 6 elements are available before last element");
			System.exit(0);
		}
		//nth element from last so check wn.next for null not wn 
		while(wn.next!=null){
			temp=temp.next;
			wn=wn.next;
		}
		System.out.println(temp.getData());
	}

}
