/*
 * To find out the guess the number from the user
 */
package com.bridgelabz.algorithm;

import com.bridgelabz.util.util;

public class Findthenumber {
	public static void main(String[] args) {
		System.out.println("Enter a number");

		int num = util.inputInteger();
		int power = (int) Math.pow(2, num);
		System.out.println("Think of a number between 0 and " + power);
		int a = util.search(0, power);/* Searching Operation a number is taken place */
		System.out.println("Your number is " + a);

	}

}
