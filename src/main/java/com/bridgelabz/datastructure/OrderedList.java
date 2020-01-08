package com.bridgelabz.datastructure;

import java.io.IOException;

import com.bridgelabz.util.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class OrderedList {
	 Node head;  
	  Node sorted;
	  Node new_data;
	    class Node 
	    { 
	        String data; 
	        Node next;
			public int new_data; 
	        Node(String new_data) 
	        { 
	            data = new_data; 
	            next = null; 
	        } 
	    }
	    public void push(String new_data) 
	    { 
	        Node new_node = new Node(new_data); 
	        new_node.next = head; 
	        head = new_node; 
	    }
	    public void printList(Node head) 
	    { 
	        Node tnode = head; 
	        while (tnode != null) 
	        { 
	            System.out.print(tnode.data+" "); 
	            tnode = tnode.next; 
	        } 
	    } 
	    public static  boolean search(Node head,String x)
		{ 
			Node current=head;     
	    while (current!=null) 
	    { 
	        if (current.data.equals(x)) 
	            return true;
	        current=current.next; 
	    } 
	    return false;
		}
	 
	  public static void sort(Node head)
	  {
	  }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OrderedList list=new OrderedList();
		File file = new File("C:\\Users\\Srijan Salian\\Desktop\\3.txt"); 	  
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		  	String st=" "; 
			String[] St=null;
		  while ((st=br.readLine())!= null)
		  {
			 St=st.split(",");
		  }
		  int n=St.length;
	
	for(int i=n-1;i>=0;i--)
	{
		list.push(St[i]);
	}
	list.printList(list.head);
	System.out.println("Enter the String");
	String x=util.inputWord();
	if(search(list.head,x)==true)
	{
	
	}
	else
	{
		list.push(x);
	}
   System.out.println("\nLinkedList After sorting"); 
   list.printList(list.head); 
}
}
