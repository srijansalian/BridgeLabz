package com.bridgelabz.basic;

import com.bridgelabz.util.util;

public class Powerof2 {
	static void power(int n) {
		int i=0;
		int a=1;
		while(n>=i) {
			System.out.println(i+"    "+a);
			a=2*a;
			i++;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		int n=util.inputInteger();
		power(n);
		

	}

}
