package com.bridgelabz.datastructure;

import java.util.ArrayList;

import com.bridgelabz.datastructure.Stack.Node;
import com.bridgelabz.util.DataStructureUtility;

public class RevofPrimeNumber 
{
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
	public void reverse(Node n) 
	{
		Node prev=null;
		Node curr=n;
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

public static void main(String[] args) {
	Stack stk=new Stack();
	ArrayList<Integer> al=new ArrayList<Integer>();
	ArrayList<Integer> al1=new ArrayList<Integer>();
	int a[][]=new int[10][57];
	al=DataStructureUtility.prime();
	//System.out.println(al);
	al1=DataStructureUtility.angara(al);
	//System.out.println(al1);
	//a=DataStructureUtility.primeDisplay(al1);
	//DataStructureUtility.print2darray(a);
	for(int i=0;i<al1.size();i++) {
		stk.push(al1.get(i));
	}
	System.out.println(stk);
	stk.reverse();
	System.out.println(stk);
	
	
	
	
}
}

