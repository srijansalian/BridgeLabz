package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.bridgelabz.util.DataStructureUtility;

public class PrimeNumberandAnagram extends PrimeNumber {
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
	public static ArrayList<Integer> angara(ArrayList<Integer> al){
		ArrayList<Integer> al1=new ArrayList<Integer>();
		for(int i=0;i<al.size();i++) 
		{
			for(int j=i;j<al.size();j++) 
			{
				if(i!=j) {
					if(anagram(String.valueOf(al.get(i)),String.valueOf(al.get(j)))) {
						al1.add(al.get(j));
					}
				}
			}
		}return al1;
		
		
	}
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
	private static int[][] primeDisplay(ArrayList<Integer> al) 
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
	public static void anaprime(int a[][]){
			
	}
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		int a[][]=new int[10][57];
		al=prime();
		//System.out.println(al);
		al1=angara(al);
		//System.out.println(al1);
		a=primeDisplay(al1);
		print2darray(a);
		
	
	}

}
