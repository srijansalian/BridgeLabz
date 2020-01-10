package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.bridgelabz.util.DataStructureUtility;

public class PrimeNumberandAnagram extends PrimeNumber {
	public static void anaprime(int a[][]){
			
	}
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		int a[][]=new int[10][57];
		al=DataStructureUtility.prime();
		//System.out.println(al);
		al1=DataStructureUtility.angara(al);
		//System.out.println(al1);
		a=DataStructureUtility.primeDisplay(al1);
		DataStructureUtility.print2darray(a);
		
	
	}

}
