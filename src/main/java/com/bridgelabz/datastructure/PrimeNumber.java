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
		System.out.println(al);
		System.out.println(size);
		primeDisplay(al,size);
	}




	private static void primeDisplay(ArrayList<Integer> al, int size) 
	{ 
		int a[][]=new int[10][168];
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<168 ;j++) 
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
		}
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




	

}
