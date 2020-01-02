package com.bridgelabz.datastructure;

public class LinkedList {
	Node head;
	
	public void insert(String data) {
		Node node= new Node(data);
		//node.data = data;
		
		if(head==null) {
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;  
		}
	}
	public void show()
	{
		Node node = head;
		while(node!=null) {
			System.out.println(node.data);
			node = node.next;
		}
	//	System.out.println(node.next);
	}
	
	
	public static void main(String[] args) {
				
		
		
	}

}
