package com.bridgelabz.basic;

import com.bridgelabz.util.util;

public class Factors {
	public static void main(String[] args) {
			
			System.out.println("Enetr a number:");
			int n = util.inputInteger();
			while(n%2==0)
			{
				System.out.print(2+ " ");
				n = n/2;
				
			}
			for(int i=3 ; i<=Math.sqrt(n);i+=2)
			{
				while(n%i ==0)
				{
					System.out.print(i+ " ");
					n = n/i;
				}
			}
			if(n>2)
			{
				System.out.print(n);
			}
		}

	}



