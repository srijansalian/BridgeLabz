package com.bridgelabz.datastructure;

import com.bridgelabz.util.DataStructureUtility;

//import com.bridgelabz.datastructure.Runner.Node;

public class UnorderedList {
	//T filename;
Node head;
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data=data;
		}
		
	}
	public void append(String data) {
		Node n=new Node (data);
		if(head==null) {
			head=new Node(data);
			return;
		}
		n.next=null;
		Node last=head;
		while(last.next!=null)
			last=last.next;
		
		last.next=n;
		return;
		
	}
	public void push(String data) {
		Node n=new Node(data);
		n.next=head;
		head=n;
	}
	
	public void printList() 
  { 
      Node tnode = head; 
      while (tnode != null) 
      { 
          System.out.print(tnode.data+" "); 
          tnode = tnode.next; 
      } 
  } 
	/**************************************************/
	public UnorderedList() {
	
	}
	////public static Node arraytolist(String arr[],int n) {
		//Node data =null;
		//LinkedList l=new LinkedList();
		//for(int i=0;i<n;i++)
		//	data=l.append(data,arr[i]);
		//return data;
		
//	}
	
	
	

	

	public static void main(String[] args) {
		String	filename = DataStructureUtility.getFromFile("C://User//Srijan Salian//Desktop//1.txt");
		if(filename!=null) {
			String words[];
			words=filename.split(" ");
		}
		else
		{
			System.out.println("Error while reading the file");
		}
		
		
		
		

	}

}
