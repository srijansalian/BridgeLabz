package com.bridgelabz.datastructure;

public class SinglyLinkedList<T> {
	@SuppressWarnings("hiding")
	class Node<T>{
		T data;
		Node<T>  next;
		Node(T data){
			this.data=(T) data;
		}
		
	}
	Node<T> head;

public boolean add(T data)
{
	Node<T> n=new Node<T>(data);
	if(head==null)
	{
		head=n;
		return true;
	}
	Node<T> t=head;
	while(t.next!=null)
	{
		t=t.next;
	}
	t.next=n;
	return true;
}
public String toString() {
	String st="[";
	Node<T> t=head;
	while(t!=null)
	{
		st=st+t.data;
		if(t.next!=null)
			st=st+"->";
		t=t.next;
	
	}
	return st + "]";
}
public boolean addfirst(T data)
{
	Node<T> n=new Node<T>(data);
	n.next=head;
	head=n;
	return true;
}
public T deletefirst() {
	if(head==null)
	{
		System.out.println("List is empty............");
		return null;
	}
	T data=head.data;
	head=head.next;
	return (T) data;
}

public T deleteLast() {
	if(head==null)
	{
		System.out.println("List is empty.....");
		return null;
	}
	Node<T> t=head;
	Node<T> t1=head;
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