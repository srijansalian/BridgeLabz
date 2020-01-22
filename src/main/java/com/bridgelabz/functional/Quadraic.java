/*
 * To find out the quadratic of the equation
 */
package com.bridgelabz.functional;

import com.bridgelabz.util.util;

public class Quadraic {

	public static void main(String[] args) {
		System.out.println("Enter the value of a");
		int a = util.inputInteger();
		System.out.println("Enter the value of b");
		int b = util.inputInteger();
		System.out.println("Enter the value of c");
		int c = util.inputInteger();
		util.quadraic(a, b, c);

	}

}
