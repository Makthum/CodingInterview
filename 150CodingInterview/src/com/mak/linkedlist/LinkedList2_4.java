package com.mak.linkedlist;

public class LinkedList2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lt= new LinkedList();
		lt.addToEnd(1);
		lt.addToEnd(2);
		lt.addToEnd(3);
		lt.addToEnd(9);
		lt.printList();
		LinkedList lt2= new LinkedList();
		lt2.addToEnd(9);
		lt2.addToEnd(9);
		lt2.addToEnd(9);
		lt2.addToEnd(9);
		lt2.printList();
		LinkedList c=LinkedList2_4.addlists(lt, lt2);
		c.printList();
	}
  
	public static LinkedList addlists(LinkedList a, LinkedList b){
		LinkedList result=new LinkedList();
		//Logic is to iterate node by node and do simple addition of the digits as you iterate through the nodes
		//create two iterator nodes
		Node ita=a.head;
		Node itb=b.head;
		int carry=0;
		while(ita!=null || itb!=null){
			//add the digits 
			if(ita!=null&&itb!=null){
				int val=ita.getData()+itb.getData()+carry;
				if(val>=10){
					val=val%10;
					carry=1;
				}
				else{
					carry=0;
				}
				result.addToEnd(val);
				ita=ita.next;
				itb=itb.next;
			}else if(ita!=null){
				int val=ita.getData();
				result.addToEnd(val);
				ita=ita.next;
			}else{
				int val=itb.getData();
				result.addToEnd(val);
				itb=itb.next;
			}
		}
		if(carry==1){
			result.addToEnd(1);
		}
		return result;
	}
}
