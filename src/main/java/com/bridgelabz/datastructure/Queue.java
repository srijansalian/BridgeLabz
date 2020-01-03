package com.bridgelabz.datastructure;

//import com.bridgelabz.util.DataStructureUtility.Node;

public class Queue {
 Node front , rear;
 
 class Node{
	 Node next;
	 Object data;
	 
	 public Node(Object data){
		 this.data=data;
		 
	 }
	 
 }
 public Queue() {
	 this.front=this.rear=null;
 }
public  void enqueue(Object data) {
	 Node temp=new Node(data);
	 if(this.rear==null)
	 {
		 this.front=this.rear=temp;
		 return;
	 }
	 this.rear.next=temp;
	 this.rear=temp;
 }
 
 public Node dequeue() {
	 if(this.front==null)
		 return null;
	 Node temp=this.front;
	 this.front=this.front.next;
	 
	 if(this.front==null)
		 this.rear=null;
	 return temp;
 }
 public String toString() {
		String st="[";
		Node t=front;
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
