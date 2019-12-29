package com.bridgelabz.JunitTesting;

import com.bridgelabz.util.util;

public class toBinary {
	

	public static void main(String[] args) {
		System.out.println("Enter the number That to be converted ");
		int a=util.inputInteger();
		int[] b=util.binary(a);
		
		//System.out.println(b[j]);
		for(int j=b.length-1;j>=0;j--) {
			System.out.print(b[j]);
		}
	}

}
