package com.bridgelabz.datastructure;

/****
 * 	
 * @author Srijan Salian
 *Implementing the stack operation
 * @param <T>
 */

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
	
	/****
	 * Used for an push operation.
	 * @param data
	 */
	
	
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

/****
 * pop operation is carried out.
 * @return data 
 */
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

/****
 * Peek operation is retrieve the data
 * @return data
 */
public T peek()
{
	if(head==null)
	{
		System.out.println("Stack underflow");
		return null;
	}
	return (T) head.data;
}

/*****
 * An overloaded method of the toString
 */
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
/***
 * Reverse of an Node
 */
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
/**
 * To find out the size of the node
 * @return size
 */
public int size() {
	
	return size;
}

/*
 * Checks the node is a empty or not
 */
public boolean isEmpty() {
	return (size==0);
}

}
