package com.bridgelabz.JunitTesting;

import com.bridgelabz.util.util;

public class tempatureconver {
	
	public static void main(String[] args) {
		int ch=0;
		System.out.println("Press 1 for convertion of Celius to Farhenheit\n Else press 2 to convert from Farhenheit to Celius");
		int n=util.inputInteger();
		ch=n;
		System.out.println("Enter the Tempature");
		float x=util.inputFloat();
		if(ch==1) {
			System.out.println("After Convertion are "+util.celtofer(x));
			
		}
		else
			System.out.println("After Convertion are "+util.fertocel(x));
	}

}
