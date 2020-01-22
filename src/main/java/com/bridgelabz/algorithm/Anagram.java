package com.bridgelabz.algorithm;

import com.bridgelabz.util.util;

public class Anagram {
	

	public static void main(String[] args) {
		String str1=util.inputWord();
		String str2=util.inputWord();/*input an variable to an variable*/
		boolean s=util.anagram(str1,str2);/*An function used to find out the anagram*/
		if(s)
			System.out.println("String is anagram");
		else
			System.out.println("Not an anagram");

	}

}
