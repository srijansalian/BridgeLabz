package com.bridgelabz.datastructure;

import com.bridgelabz.util.util;

public class Palindrome {
	public static boolean ispalindrome(String str) {
		Stack<Character> sk=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			sk.push(str.charAt(i));
		}
		int i=0;
		while(!sk.isEmpty())
		{
			if(sk.pop()!=str.charAt(i))
				return false;
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		String str=util.inputWord();
		boolean rs=ispalindrome(str);
		if(rs)
			System.out.println("Given String is a Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

}
