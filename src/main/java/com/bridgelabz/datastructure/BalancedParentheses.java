package com.bridgelabz.datastructure;

import com.bridgelabz.util.util;
/*
 * To find the given string is a Balanced or not
 */

public class BalancedParentheses {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		String str = util.inputWord();
		boolean rs = util.isBalanced(str);
		if (rs)
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");

	}

}
