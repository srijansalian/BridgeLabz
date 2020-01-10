package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class util {
	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));;
	static  Scanner sc=new Scanner(System.in);
	
	 public util(){
		
	}
	 /*This method is used to input a String*/
	 
	 public static String inputWord(){ 
		//System.out.println("Enter the String");
		String str=sc.next();
		return str;
	 }
	 /*This method is used to input an numbers*/
	 
	 public static int inputInteger(){
		 
			
		 int n=sc.nextInt();
		 return n;
		 
	}
	 /*It is used to input a float value to it*/
	 public static float inputFloat() {
		 float n=sc.nextFloat();
		 return n;
	 }
	 /*It is used input an double value*/
	 public static double inputDouble(){
		 
		
		 double n=sc.nextDouble();
		 return n;
	}
	 /*It is used to input an Array*/
	 
	 public static int[] inputArray() {
		 
		 
		 System.out.println("Enter the value of n");
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 System.out.println("Enter the values");
		 for(int i=0;i<n;i++)
			 
			arr[i]=sc.nextInt();
		 return arr;
			 
	 }
	 /*It is used to input an String array*/
	 public static String[] inputString() {
		 System.out.println("Enter the value of n");
		 int n=sc.nextInt();
		 String arr[]=new String[n];
		 System.out.println("Enter the String ");
		 for(int i=0;i<n;i++)
			 arr[i]=sc.next();
		 return arr;
	 }
	 /*It is used to Display an array*/
	 public static void displayarr(int arr[]) {
		 for(int i=0;i<arr.length;i++)
			 System.out.println(arr[i]);
	 }
	 /*It is used to display array string*/
	 public static void printArraystring(String str[]) 
	 { 
	     for (int i=0; i<str.length; i++) 
	         System.out.print(str[i]+" "); 
	 } 
	 
	 /*It is used to check the year id true or false*/
	public static boolean isleap(int year) {
		if(year%4==0 && year%100!=0 || year%400==0)
			return true;
		return false;
	}
	/*It is used to input an Two d array*/
	public static int[][] TwodArray(){
		System.out.println("Enter the value of m");
		
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
	/*It is used to check the day of week*/
	public static String dayofweek(int d,int m,int y) {
		String mon[]= {"sun","mon","thu","wed","thus","Fri","Sat"};
		int  a=y-(14-m)/12;
		 int b=a+a/4-a/100+a/400;
		 int c=m+12*((14-m)/12)-2;
		 int e=((d+b+31*c/12)%7);
	
			//System.out.println(mon[e]);
		 return mon[e];
		
	}
	/*It is used to find the Temp from cel to fer*/
	public static float celtofer(float c) {
		float a=(c*9/5)+32;
		return a;
	}
	
	/*It is used to find out the from the fer to cel*/
	public static float fertocel(float f) {
		float b=(f-32)*5/9;
		return b;
	}
	/*It is used to find payment*/
	public static double montlypayment(float p,float y,float R) {
		float n=12*y;
		float r=R/(12*100);
		double pay=(p*r)/(1-Math.pow(1+r, -n));
		return pay;
		
	}
	/*Used to find out the square root*/
	public static double sqrt(int  c) {
		double epsilon=1e-15;
		double t=c;
		while(Math.abs(t-c/t)>epsilon*t) {
		t=((c/t)+t)/2;
		
		}return t;
	}
	/*Used to input an boolean values*/
	public static boolean inputboolean() {
		boolean a=sc.nextBoolean();
		return a;
	}
	
	/*Used to  find out the  given string is an anagram or not*/
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
	/*Bubble search of an Integer*/
		public static int[]  Bubblesort(int arr[] ) {
			int n = arr.length;
			for(int i = 0;i <= n; i++) {
				for(int j = 0;j <n-i-1 ; j++) {
					if(arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;					
						
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
		/*Binary search of a string */
		public static int strBinarySearch(String[] arr, String key) {
			int s = 0, e = arr.length - 1, mid;
			while (s <= e) {
				mid = s + (e - s) / 2;

				if (arr[mid].equals(key))
					return mid;

				if (arr[mid].compareTo(key) > 0)
					s = mid + 1;

				else
					e = mid - 1;
			}
			return -1;
		}
		/*String insertion sort*/
		public static String[] strInsertionSort(String[] arr) {
			String key;
			int j = 0;
			for (int i = 1; i < arr.length; i++) {
				key = arr[i];
				j = i - 1;
				while (j >= 0 && arr[j].compareTo(key) > 0) {
					arr[j + 1] = arr[j];
					j = j - 1;
				}
				arr[j + 1] = key;
			}
			return arr;
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
		/*Insertion sort for an integer*/
		public static int[] intInsertionSort(int[] arr) {
			
			int temp;
			int j = 0;
			for (int i = 1; i < arr.length; i++) {
				temp = arr[i];
				j = i - 1;
				while (j >= 0 && arr[j] > temp) {
					arr[j + 1] = arr[j];
					j = j - 1;
				}
				arr[j + 1] = temp;
			}
			return arr;
		}
		/*Merge sort of an String*/
		public static  void  merge(String[] arr, int s, int m, int e) {
			int p = s, q = m + 1;
			String[] newArr = new String[e - s + 1];
			int j = 0;
			for (int i = s; i <= e; i++) {
				if (p > m)
					newArr[j++] = arr[q++];
				else if (q > e)
					newArr[j++] = arr[p++];
				else if (arr[p].compareTo(arr[q]) < 0)
					newArr[j++] = arr[p++];
				else
					newArr[j++] = arr[q++];
			}
			for (int k = 0; k < j; k++) {
				arr[s++] = newArr[k];
			}

		}
		/*Merge sorting*/
		public static  void sort(String arr[], int l, int r) 
	    { 
	        if (l < r) 
	        { 
	            int m = (l+r)/2; 
	            sort(arr, l, m); 
	            sort(arr , m+1, r); 
	            merge(arr, l, m, r); 
	        }util.printArraystring(arr);
		
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
		/*Palindrome or not*/ 
		public static boolean isPalindrome(int num) {
			int r, sum = 0;
			int temp = num;
			while (num > 0) {
				r = num % 10;
				sum = (sum * 10) + r;
				num = num / 10;
			}
			if (temp == sum) {
				return true;
			} else {
				return false;
			}
		}
		/*Converting to binary*/
		
			public static int[] binary(int z) {
				int b[]=new int[8];
				int i=0;
				while(z>0) {
					 b[i]=z%2;
					 z=z/2;
					i++;
				}
				return b;
				

			}
		
		
	
}
