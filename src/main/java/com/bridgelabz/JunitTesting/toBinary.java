package com.bridgelabz.JunitTesting;

import com.bridgelabz.util.util;

public class toBinary {
	static void binary(int z) {
		int b[]=new int[100];
		int i=0;
		while(z>0) {
			 b[i]=z%2;
			 z=z/2;
			i++;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(b[j]);
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter the number That to be converted ");
		int a=util.inputInteger();
		binary(a);
	}

}
