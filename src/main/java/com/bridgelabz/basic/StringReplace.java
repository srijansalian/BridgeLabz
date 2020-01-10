package com.bridgelabz.basic;
import com.bridgelabz.util.util;
public class StringReplace {

	public static void main(String[] args) {
		System.out.println("Enter the Name");
		String s=util.inputWord();
	String str1="Hello name , How are u ? ";
		String a=str1.replace("name", s);
		System.out.println(a);
		

	}

}
