package com.bridgelabz.datastructure;

import java.util.ArrayList;

import com.bridgelabz.util.DataStructureUtility;

public class PrimeAnagramUsingQueue 
	{
	public static void main(String[] args)
	{
		Queue Q = new Queue();
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		int a[][]=new int[10][57];
		al=DataStructureUtility.prime();
		al1=DataStructureUtility.angara(al);
		for(int i=0;i<al1.size();i++) {
			Q.enqueue(al1.get(i));
			
		}
		System.out.println(Q);
		
	}
	

}

