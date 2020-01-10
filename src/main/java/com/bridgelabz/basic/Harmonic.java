package com.bridgelabz.basic;
import com.bridgelabz.util.util;
public class Harmonic {
	static double Harnoi(int n) {
		float h1=1;
		for(int i=2;i<=n;i++) {
			h1+=(float)1/i;
		}
			return h1;
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		int n=util.inputInteger();
		System.out.println(Harnoi(n));
		

	}

}
