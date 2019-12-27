package com.bridgelabz.Algorithm;

import com.bridgelabz.util.util;

public class Insertionsort {
	static void sort(String []s, int n) 
	{ 
	    for (int i=1 ;i<n; i++) 
	    { 
	        String temp = s[i]; 
	  
	        // Insert s[j] at its correct position 
	        int j = i - 1; 
	        while (j >= 0 && temp.length() < s[j].length()) 
	        { 
	            s[j+1] = s[j]; 
	            j--; 
	        } 
	        s[j+1] = temp; 
	    }util.printArraystring(s); 
	} 
		public static void main(String[] args) {
			String ar[]=util.inputString();
			int n=ar.length;
			sort(ar,n);
			
			
			
		}

}
