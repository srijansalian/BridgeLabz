package com.bridgelabz.algorithm;

import com.bridgelabz.util.util;
/*
 * To find out the Prime range in the given Range
 */
public class PrimeRange {

	public static void main(String[] args) {

		System.out.println("Entet the first number and the second number");
		int num1 = util.inputInteger();
		int num2 = util.inputInteger();
		util.prime(num1, num2);//Prime method is called

	}

}
