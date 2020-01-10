package com.bridgelabz.datastructure;
/*Creating an for a single linked list */ 

public class SinglyLinkedList<T> {
	int size=0;
	@SuppressWarnings("hiding")
	
	class Node<T>{
		T data;
		Node<T>  next;
		Node(T data){
			this.data=(T) data;
		}
		
	}
	Node<T> head;

	
	          /* Adds new Elements into the list   */
	
	
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
	size+=1;
	return true;
}

/*Overriding method of toString*/

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

/* This method id used  to add the node at the beginning of the list */

public boolean addfirst(T data)
{
	Node<T> n=new Node<T>(data);
	n.next=head;
	head=n;
	size+=1;
	return true;
}

/*Delete first is used to delete the elements*/

public T deletefirst() {
	if(head==null)
	{
		System.out.println("List is empty............");
		return null;
	}
	T data=head.data;
	head=head.next;
	size-=1;
	return (T) data;
}

/*  The elements delete the node at the end the list */


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
	size-=1;
	return t.data;
	
}
 /* Remove's an data from the given list*/
public void remove(T item) {
	Node<T> n = head;
	Node<T> prev = null;
	if (head.data.equals(item)) {
		head = head.next;
		size -= 1;
		return;
	}
	while (!n.data.equals(item)) {
		prev = n;
		n = n.next;
	}
	n = n.next;
	prev.next = n;
	n = null;
	size -= 1;
}

/* The method is used to remove the element at the end node */

public void removeAtLast() {
	Node<T> n = head;
	Node<T> prev = null;
	while (n.next != null) {
		prev = n;
		n = n.next;
	}
	prev.next = null;
	size--;
}

/* The method is used to check the key element is present in the node*/

public boolean search(T item) {
	Node<T> n = head;
	while (n.next != null) {
		if (n.data.equals(item)) {
			return true;
		}
		n = n.next;
	}
	return false;
}

/* The method is used check whether the node is null or not*/


public boolean isEmpty() {
	if (head == null) {
		return true;
	}
	return false;
}

/* The method is check the size of the node*/

public int size() {
	return size;
}
/* Removes and returns last item in the list*/
public T pop() {
	Node<T> n = head;
	if (size == 1) {
		head = head.next;
		size--;
		return (T) n.data;
	}
	while (n.next != null) {
		n = n.next;
	}
	T ret = (T) n.data;
	n = n.next;
	size -= 1;
	return ret;
}


}