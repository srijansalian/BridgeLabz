package com.bridgelabz.datastructure;

import com.bridgelabz.util.util;
/*
 * Problem statement to find out the number of search operation is taken place  
 */

public class BinarySearchTree {

	public static void main(String[] args) {
		System.out.println("Enter the values from 0 to 1000");
		int n = util.inputInteger();
		int a = util.binarycount(n);
		System.out.println(a);
	}

}
