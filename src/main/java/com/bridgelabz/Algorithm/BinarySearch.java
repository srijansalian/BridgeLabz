package com.bridgelabz.Algorithm;

//import java.io.File;
import java.io.FileReader;
//import java.util.*;
//import java.io.IOException;
import java.io.*;
import java.util.Scanner;
public class BinarySearch {
	 static int binarySearch(String[] arr, String x) 
	    { 
	        int l = 0, r = arr.length - 1; 
	        while (l <= r) { 
	            int m = l + (r - l) / 2; 
	  
	            int res = x.compareTo(arr[m]); 
	  
	            // Check if x is present at mid 
	            if (res == 0) 
	                return m; 
	  
	            // If x greater, ignore left half 
	            if (res > 0) 
	                l = m + 1; 
	  
	            // If x is smaller, ignore right half 
	            else
	                r = m - 1; 
	        } 
	  
	        return -1; 
	    } 
	
	

	public static void main(String[] args)throws java.io.IOException {
		File f1=new File("C:\\Users\\Srijan Salian\\Desktop\\blabz\\1.txt");
		FileReader fr=new FileReader(f1);
		String[] str=new String[200];
		BufferedReader br=new BufferedReader(fr);
		String []word=new String[100];
		String s;
		System.out.println("Enter the word to be searched");
		Scanner sc=new Scanner(System.in);
		String input= sc.next();
		//String input="JAVA";
		int count=0;
		while((s=br.readLine())!=null) {
			//System.out.println("h");
			word=s.split(",");
			
			//for(int i=0;i<word.length;i++) {
			//System.out.println(word);}
			//for(String words:word) {
				//if(words.equals(input)) {
					//count++;
					
				}
		int result=binarySearch(word,input);
		if(result==0)
			System.out.println("Not fount");
		else
			System.out.println("The String is present in the file");
			//}
		//}
		//if(count==0) {
			//System.out.println("No words is found");
			
		//}else {
			//System.out.println("The given word is present "+count+"times");
			
		//}
		
		// TODO Auto-generated method stub

	}

}

