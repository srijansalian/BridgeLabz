package com.bridgelabz.datastructure;

//import com.bridgelabz.datastructure.SinglyLinkedList.Node;

public class Stack<T> {
	
	@SuppressWarnings("hiding")
	class Node <T>{
		T data;
		Node<T>  next;
		Node(T data){
			this.data=data;
		}
	}Node<T> head;
	int size=1;
public void push(T data) {
	Node<T> n=new Node<T>(data);
	if(head==null) {
		head=n;
		return;
	}
	n.next=head;
	head=n;
	size++;
}
public T pop()
{
	if(head==null)
	{
		System.out.println("Stack Underflow");
		return null;
	}
	T data=(T) head.data;
	head=head.next;
	size--;
	return data;
}
public T peek()
{
	if(head==null)
	{
		System.out.println("Stack underflow");
		return null;
	}
	return (T) head.data;
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
public void reverse() 
{
	Node<T> prev=null;
	Node<T> curr=head;
	Node<T> next=null;
	while(curr!=null)
	{
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
		
	}
	head=prev;
	

}
public int size() {
	// TODO Auto-generated method stub
	return size;
}
public boolean isEmpty() {
	return (size==0);
}

}
