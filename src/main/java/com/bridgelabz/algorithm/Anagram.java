/*
 * To find out the given two String is anagram or not
 */
package com.bridgelabz.algorithm;

import com.bridgelabz.util.util;

public class Anagram {

	public static void main(String[] args) {
		String str1 = util.inputWord();
		String str2 = util.inputWord();/* input an variable to an variable */
		boolean anagram = util.anagram(str1, str2);/* An function used to find out the anagram */
		if (anagram)
			System.out.println("String is anagram");
		else
			System.out.println("Not an anagram");

	}

}
