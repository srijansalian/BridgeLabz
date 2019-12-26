package com.bridgelabz.basic;

import com.bridgelabz.util.util;

public class LeapYear {

	public static void main(String[] args) {
				System.out.println("Enter the year");
		int year=util.inputInteger();
		boolean l=util.isleap(year);
		if(l)
			System.out.println("The "+year+" is a leap year" );
		else
			System.out.println("Not an leap year");

	}

}
