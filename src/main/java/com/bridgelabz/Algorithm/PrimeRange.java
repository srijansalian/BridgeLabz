package com.bridgelabz.Algorithm;

import com.bridgelabz.util.util;

public class PrimeRange {
	static void prime(int a,int b) {
		int flag=0;
		for(int i=a;i<=b;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=0;
					break;
				}else
					flag=1;
			}	
			if(flag==1)
			System.out.println(i);
		}
		
	}
public static void main(String[] args) {
		
		System.out.println("Entet the first number and the second number");
		int a=util.inputInteger();
		int b=util.inputInteger();
		prime(a,b);

	}


}
