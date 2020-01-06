package com.bridgelabz.datastructure;

import com.bridgelabz.util.util;

public class BalancedParentheses {
	public static boolean isBalanced(String str)
	{
		Stack<Character> sk =new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='{' ||ch=='['|| ch=='(')
			{
				sk.push(ch);
				
			}
			else
			{
				if(sk.size()==0)
					return false;
				Character c=sk.pop();
				if(ch==')')
				{
					if(c!='(')
						return false;
				}
				else if(ch=='}')
				{
					if(c!='{')
						return false;
				}
				else if(ch==']') {
					if(c!='[')
						return false;
				}
			}
		}return sk.size()==0;
	}

	public static void main(String[] args) {
		System.out.println("Enter the string");
		String str=util.inputWord();
		boolean rs=isBalanced(str);
		if(rs)
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");

	}

}
