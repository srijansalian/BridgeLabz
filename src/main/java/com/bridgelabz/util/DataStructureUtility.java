package com.bridgelabz.util;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
//import com.bridgelabz.model.Stock;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.datastructure.Node;

//import com.bridgelabz.datastructure.SinglyLinkedList.Node;

//import com.bridgelabz.model.UserDetails;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
//import com.bridgelabz.utility.SortingFunction;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Arrays;
	import java.util.Scanner;
	
	

	public class DataStructureUtility<T> {
		BufferedReader br;
		static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));;
		static  Scanner sc=new Scanner(System.in);
		
		 public DataStructureUtility(){
			
		}
		 /*Import a file from the system*/
			public static String getFromFile(String path) {
				BufferedReader bufferedReader = null;
				String str = "";
				try {
					bufferedReader = new BufferedReader(new FileReader(path));
					str = bufferedReader.readLine();
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return str;
			}
			public String getFileText(T fileName){

				try{

					br=new BufferedReader(new FileReader((String) fileName));
					StringBuilder sb=new StringBuilder();
					T line=(T) br.readLine();
					while(line!=null){
						sb.append(line);
						sb.append(System.lineSeparator());
						line=(T) br.readLine();
					}
					return sb.toString();
				 }
				catch(Exception exception){
					return null;
				}
				finally{
					try{
						br.close();
					}
					catch(IOException exception){
					}	
				}
			}
			
			//this function take two parameter 
			// 1 what data to write.
			// 2 file name
			public void writeToFile(String data,String fileName)throws Exception{
				File file = new File(fileName);
				if (!file.exists()) {
					file.createNewFile();
				}
				FileWriter writer = new FileWriter(file); 
		       // Writes the content to the file
		       writer.write(data); 
		       writer.flush();
		       writer.close();
			}
			
			class Node{
				Object data;
				Node next;
				Node(Object data){
					this.data=data;
				}
				
			}
			Node head;

		public boolean add(Object data)
		{
			Node n=new Node(data);
			if(head==null)
			{
				head=n;
				return true;
			}
			Node t=head;
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=n;
			return true;
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
		public boolean addfirst(Object data)
		{
			Node n=new Node(data);
			n.next=head;
			head=n;
			return true;
		}
		public Object deletefirst() {
			if(head==null)
			{
				System.out.println("List is empty............");
				return null;
			}
			Object data=head.data;
			head=head.next;
			return data;
		}

		public Object deleteLast() {
			if(head==null)
			{
				System.out.println("List is empty.....");
				return null;
			}
			Node t=head;
			Node t1=head;
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
		public void show()
		{
			Node node = head;
			while(node!=null) {
				System.out.println(node.data);
				node = node.next;
			}
		//	System.out.println(node.next);
		}
		public boolean searchword(String Key) {
			Node node=head;
			while(node!=null) {
				if(node.data.equals(Key))
					return true;
				
			}return false;
		}
		/*to find out number is a prime or not*/
		public static boolean isPrime(int num) {
			if (num == 0 || num == 1) {
				return false;
			}
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;

		}

}


