package com.bridgelabz.Algorithm;

//import java.util.Arrays;

import com.bridgelabz.util.util;

public class Anagram {
	

	public static void main(String[] args) {
		String str1=util.inputWord();
		String str2=util.inputWord();
		boolean s=util.anagram(str1,str2);
		if(s)
			System.out.println("String is anagram");
		else
			System.out.println("Not an anagram");

	}

}
