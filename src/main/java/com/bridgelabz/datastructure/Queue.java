package com.bridgelabz.datastructure;

//import com.bridgelabz.util.DataStructureUtility.Node;

public class Queue<T> {
 Node<T> front , rear;
 
 @SuppressWarnings("hiding")
class Node<T>{
	 Node<T> next;
	 T data;
	 
	 public Node(T data){
		 this.data=data;
		 
	 }
	 
 }
 public Queue() {
	 this.front=this.rear=null;
 }
public  void enqueue(T data) {
	 Node<T> temp=new Node<T>(data);
	 if(this.rear==null)
	 {
		 this.front=this.rear=temp;
		 return;
	 }
	 this.rear.next=temp;
	 this.rear=temp;
 }
 
 public Node<T> dequeue() {
	 if(this.front==null)
		 return null;
	 Node<T> temp=this.front;
	 this.front=this.front.next;
	 
	 if(this.front==null)
		 this.rear=null;
	 return temp;
 }
 public String toString() {
		String st="[";
		Node<T> t=front;
		while(t!=null)
		{
			st=st+t.data;
			if(t.next!=null)
				st=st+"->";
			t=t.next;
		
		}
		return st + "]";
	}
 
}
