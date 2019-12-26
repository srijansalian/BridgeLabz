package com.bridgelabz.functional;

import com.bridgelabz.util.util;

public class SumofZero {
	static void Sumzero(int a[]) {
		int count=0;
		for(int i=0;i<a.length-2;i++) 
		{
		for(int j=i+1;j<a.length-1;j++) 
			{
			
			for(int k=j+1;k<a.length;k++) 
				{
				if(a[i]+a[j]+a[k]==0) {
					count++;
				}
				
			}
		}
	}
	System.out.println("The number of time  "+count);
	}
	public static void main(String[] args) {
		
		int a[]=util.inputArray();
		Sumzero(a);
		

	}

}
