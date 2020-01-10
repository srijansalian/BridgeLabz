package com.bridgelabz.datastructure;

public class StackRunner {

	public static void main(String[] args) {
		Stack stk=new Stack();
		stk.push(125);
		stk.push("Hello");
		stk.push(153);
		stk.push(2566);
		stk.push(259);
		stk.push(1255);
		stk.pop();
		System.out.println(stk);

	}

}