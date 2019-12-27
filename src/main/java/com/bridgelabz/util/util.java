package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class util {
	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));;
	static  Scanner sc=new Scanner(System.in);
	
	 public util(){
		
	}
	 public static String inputWord(){ //To input an String
			//try{
				//return bufferedReader.readLine();
			//}
			//catch(IOException exception){
				//System.out.println(exception.getMessage());
		//	}
			//return "";
		//}
		System.out.println("Enter the String");
		String str=sc.next();
		return str;
	 }
	 public static int inputInteger(){
		 
			//try{
				//try{	
					//return Integer.parseInt(bufferedReader.readLine());
			//	}
				//catch(NumberFormatException exception){
					//System.out.println(exception.getMessage());	
			//	}
			//}catch(IOException exception){
				//System.out.println(exception.getMessage());
		//	}
		//return 0;
		// System.out.println("Enter the Number");
		 int n=sc.nextInt();
		 return n;
		 
	}
	 public static float inputFloat() {
		 float n=sc.nextFloat();
		 return n;
	 }
	 public static double inputDouble(){
		 
		//	try{
			//	try{	
				//	return Double.parseDouble(bufferedReader.readLine());
				//}
				//catch(NumberFormatException exception){
					//System.out.println(exception.getMessage());	
			//	}
			//}catch(IOException exception){
				//System.out.println(exception.getMessage());
		//	}
		//return 0.0;
		 double n=sc.nextDouble();
		 return n;
	}
	 public static int[] inputArray() {
		 
		 
		 System.out.println("Enter the value of n");
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 System.out.println("Enter the values");
		 for(int i=0;i<n;i++)
			 
			arr[i]=sc.nextInt();
		 return arr;
			 
	 }
	 public static String[] inputString() {
		 System.out.println("Enter the value of n");
		 int n=sc.nextInt();
		 String arr[]=new String[n];
		 System.out.println("Enter the value ");
		 for(int i=0;i<n;i++)
			 arr[i]=sc.next();
		 return arr;
	 }
	 public static void displayarr(int arr[]) {
		 for(int i=0;i<arr.length;i++)
			 System.out.println(arr[i]);
	 }
	 public static void printArraystring(String str[]) 
	 { 
	     for (int i=0; i<str.length; i++) 
	         System.out.print(str[i]+" "); 
	 } 
	 

	public static boolean isleap(int year) {
		if(year%4==0 && year%100!=0 || year%400==0)
			return true;
		return false;
	}
	public static int[][] TwodArray(){
		System.out.println("Enter the value of m");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int a[][]=new int [m][n];
		System.out.println("Enter the value");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				 a[i][j]=sc.nextInt();
			}
		}return a;
	}
	public static String dayofweek(int d,int m,int y) {
		String mon[]= {"sun","mon","thu","wed","thus","Fri","Sat","sun"};
		int  a=y-(14-m)/12;
		 int b=a+a/4-a/100+a/400;
		 int c=m+12*((14-m)/12)-2;
		 int e=((d+b+31*c/12)%7);
	
			//System.out.println(mon[e]);
		 return mon[e];
		
	}
	public static float celtofer(float c) {
		float a=(c*9/5)+32;
		return a;
	}
	
	
	public static float fertocel(float f) {
		float b=(f-32)*5/9;
		return b;
	}
	public static double montlypayment(float p,float y,float R) {
		float n=12*y;
		float r=R/(12*100);
		double pay=(p*r)/(1-Math.pow(1+r, -n));
		return pay;
		
	}
	public static double sqrt(int  c) {
		double epsilon=1e-15;
		double t=c;
		while(Math.abs(t-c/t)>epsilon*t) {
		t=((c/t)+t)/2;
		
		}return t;
	}
	public static boolean inputboolean() {
		boolean a=sc.nextBoolean();
		return a;
	}
	public static boolean anagram(String a,String b) {
		int n1=a.length();
		int n2=b.length();
		if(n1!=n2)
			return false;
		char ar1[]=a.toCharArray();
		char ar2[]=b.toCharArray();
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		for(int i=0;i<ar1.length;i++) 
			if(ar1[i]!=ar2[i])
				return false;
		
		return true;
			
	}
	/*Bubble search*/
		public static int[]  Bubblesort(int arr[] ) {
			int n=arr.length;
			for(int i=0;i<=n;i++) {
				for(int j=0;j<n-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;					
						
					}
				}
				
			}return arr;
		}
		/*to find the number*/
		public static int search(int lo,int hi) {
			
			 
			if((hi-lo)==1)
				return lo;
			int mid=(lo+hi)/2;
			System.out.println("Is the number is less than  "+mid);
			
			boolean s=util.inputboolean();
			if(s) 
				return search(lo,mid);
			
				
			return search(mid,hi);
			
			
		}
	
}
