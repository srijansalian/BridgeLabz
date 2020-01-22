/*
 * To Find out the Distance 
 */
package com.bridgelabz.functional;

import com.bridgelabz.util.util;

public class Distance {

	public static void main(String[] args) {
		int x = util.inputInteger();
		int y = util.inputInteger();
		int result = (x * x + y * y);
		double d = Math.pow(result, 0.5);
		System.out.println(d);
	}

}
