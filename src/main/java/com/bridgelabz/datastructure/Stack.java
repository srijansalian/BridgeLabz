package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.SinglyLinkedList.Node;

public class Stack {
	class Node{
		Object data;
		Node next;
		Node(Object data){
			this.data=data;
		}
	}Node head;
public void push(Object data) {
	Node n=new Node(data);
	if(head==null) {
		head=n;
		return;
	}
	n.next=head;
	head=n;
}
public Object pop()
{
	if(head==null)
	{
		System.out.println("Stack Underflow");
		return null;
	}
	Object data=head.data;
	head=head.next;
	return data;
}
public Object peek()
{
	if(head==null)
	{
		System.out.println("Stack underflow");
		return null;
	}
	return head.data;
}
public String toString() {
	String st="[";
	Node t=head;
	while(t!=null)
	{
		st=st+t.data;
		if(t.next!=null)
			st=st+"->";
		t=t.next;
	
	}
	return st + "]";
}
public void reverse() 
{
	Node prev=null;
	Node curr=head;
	Node next=null;
	while(curr!=null)
	{
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
		
	}
	head=prev;

}
}
