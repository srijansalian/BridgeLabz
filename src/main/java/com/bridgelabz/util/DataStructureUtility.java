package com.bridgelabz.util;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

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
		/*Creating of node */
		class Node{
			Object data;
			Node next;
			Node(Object data){
				this.data=data;
			}
			
		}
		Node head;

		
		/*Adding an data into a node*/
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
	/*A overriding toString method */
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
	
	/*Function is used to add the element at the first*/
	public boolean addfirst(Object data)
	{
		Node n=new Node(data);
		n.next=head;
		head=n;
		return true;
	}
	
	/*Function is used to Delete at first*/
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
	/*Function is used to delete at last*/
	
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
	/*Function used to display the node*/
	public void show()
	{
		Node node = head;
		while(node!=null) {
			System.out.println(node.data);
			node = node.next;
		}
	//	System.out.println(node.next);
	}
	
	/*Adding the prime element into an ArrayList*/
	public static ArrayList<Integer> prime() 
	{
		ArrayList<Integer> lst = new ArrayList<Integer>();
		for(int i=2;i<=1000;i++) 
		{
			boolean s=DataStructureUtility.isPrime(i);
			if(s) 
			{
				lst.add(i);
			}
		}
		return lst;
		
	}
	/*Display the prime number in the 0-1000 order*/
	
	public static int[][] primeDisplay(ArrayList<Integer> al) 
	{ 
		int a[][]=new int[10][57];
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length ;j++) 
			{
				if(i==0&&(al.get(j)>0&&al.get(j)<=100)) 
					a[i][j] = al.get(j);
					
				
				if(i==1&&(al.get(j)>100&&al.get(j)<=200)) 
					a[i][j] = al.get(j);
				if(i==2&&(al.get(j)>200&&al.get(j)<=300)) 
					a[i][j] = al.get(j);
				if(i==3&&al.get(j)>300&&al.get(j)<=400) 
					a[i][j] = al.get(j);
				if(i==4&&al.get(j)>400&&al.get(j)<=500) 
					a[i][j] = al.get(j);
				if(i==5&&al.get(j)>500&&al.get(j)<=600) 
					a[i][j] = al.get(j);
				if(i==6&&al.get(j)>600&&al.get(j)<=700) 
					a[i][j] = al.get(j);
				if(i==7&&al.get(j)>700&&al.get(j)<=800) 
					a[i][j] = al.get(j);
				if(i==8&&al.get(j)>800&&al.get(j)<=900) 
					a[i][j] = al.get(j);
				if(i==9&&al.get(j)>900&&al.get(j)<=1000) 
					a[i][j] = al.get(j);
				
			}
		}return a;
		
	}
	/*To find out the giving String is a anagram of not*/
	
	public static boolean anagram(String a,String b) {
		int n1=a.length();
		int n2=b.length();
		if(n1!=n2)
			return false;
		char ar1[]=a.toCharArray();
		char ar2[]=b.toCharArray();
		Arrays.sort(ar1);/*Sorting of an array*/
		Arrays.sort(ar2);
		for(int i=0;i<ar1.length;i++) 
			if(ar1[i]!=ar2[i])
				return false;
		
		
		return true;
			
	}
	/*To print out the 2d Array*/
	public static void print2darray(int a[][]) 
	{
		for(int i1=0;i1<a.length;i1++) 
		{
			for(int j1=0;j1<a[i1].length;j1++) 
			{
				if(a[i1][j1]!=0) 
				{
					System.out.print(a[i1][j1]+" ");
				}
			}
			System.out.println();
		}
		
		
		
	}
	/*adding the anagram value into a list*/
	public static ArrayList<Integer> angara(ArrayList<Integer> al){
		ArrayList<Integer> al1=new ArrayList<Integer>();
		for(int i=0;i<al.size();i++) 
		{
			for(int j=i;j<al.size();j++) 
			{
				if(i!=j) {
					if(DataStructureUtility.anagram(String.valueOf(al.get(i)),String.valueOf(al.get(j)))) {
						al1.add(al.get(j));
					}
				}
			}
		}return al1;
		
		
	}
	/*It is used to input an Array*/
	 
	 public static int[] inputArray() {
		 
		 
		 System.out.println("Enter the value of n");
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		// System.out.println("Enter the values");
		 for(int i=0;i<n;i++)
			 
			arr[i]=sc.nextInt();
		 return arr;
			 
	 }
	 public static String readFile(String path) throws IOException {
			String str = "";
			BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
			str = bufferedReader.readLine();
			bufferedReader.close();
			return str;
		}
	 public static String writeFile(String path, String str) throws IOException {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
			bufferedWriter.write(str);
			bufferedWriter.close();
			return "\nFile is Written...";
		}

}


