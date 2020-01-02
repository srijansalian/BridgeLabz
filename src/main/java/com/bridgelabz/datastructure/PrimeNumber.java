package com.bridgelabz.datastructure;

import java.util.ArrayList;

import com.bridgelabz.util.DataStructureUtility;

public class PrimeNumber {

	public static ArrayList<Integer> prime() {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		for(int i=2;i<=1000;i++) {
			boolean s=DataStructureUtility.isPrime(i);
			if(s) {
				lst.add(i);
				}
		}
		return lst;
		
	}
	
		
		
	
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		// TODO Auto-generated method stub
		al=prime();
		int size=al.size();
		//System.out.println(al);
		//System.out.println(size);
		primeDisplay(al,size);
	}




	private static void primeDisplay(ArrayList<Integer> al, int size) 
	{ 
		int a[][]=new int[10][30];
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=30;j++) {
				a[i][j]=al.get(j);
			}
			
			
			
		}
		System.out.println(a);
		// TODO Auto-generated method stub
		
	}

}
