package com.bridgelabz.algorithm;

import com.bridgelabz.util.util;
public class Findthenumber {
	public static void main(String[] args) {
	System.out.println("Enter a number");
	
	int k=util.inputInteger();
	int n=(int )Math.pow(2, k);
	System.out.println("Think of a number between 0 and "+n);
	int a=util.search(0,n);/*Searching Operation a number is taken place*/  
	System.out.println("Your number is "+a);
	

}


}
