package com.bridgelabz.datastructure;

public class SinglyLinkedList {
	class Node{
		Object data;
		Node next;
		Node(Object data){
			this.data=data;
		}
		
	}
	Node head;

public boolean add(Object data)
{
	Node n=new Node(data);
	if(head==null)
	{
		head=n;
		return true;
	}
	Node t=head;
	while(t.next!=null)
	{
		t=t.next;
	}
	t.next=n;
	return true;
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
public boolean addfirst(Object data)
{
	Node n=new Node(data);
	n.next=head;
	head=n;
	return true;
}
public Object deletefirst() {
	if(head==null)
	{
		System.out.println("List is empty............");
		return null;
	}
	Object data=head.data;
	head=head.next;
	return data;
}

public Object deleteLast() {
	if(head==null)
	{
		System.out.println("List is empty.....");
		return null;
	}
	Node t=head;
	Node t1=head;
	while(t.next!=null)
	{
		t1=t;
		t=t.next;
	}
	if(t1.next==null)
		head=null;
	else
		t1.next=null;
	return t.data;
}
}