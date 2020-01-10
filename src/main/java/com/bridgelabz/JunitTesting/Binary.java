package com.bridgelabz.JunitTesting;

import com.bridgelabz.util.util;

public class Binary {
	static void binary(int n) {
	System.out.println(swap(n));
	int z=swap(n);
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
	static int swap(int x) {
	return((x&0x0F)<<4|(x&0xF0)>>4);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number ");
		int n=util.inputInteger();
		binary(n);

	}

}
