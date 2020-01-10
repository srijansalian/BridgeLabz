package com.bridgelabz.JunitTesting;

import com.bridgelabz.util.util;

public class MontlyPayment {
public static void main(String[] args) {
		System.out.println("Enter the Principle Year and Rate");
		float p=util.inputFloat();
		float y=util.inputFloat();
		float R=util.inputFloat();
		System.out.println("Payment is "+util.montlypayment(p, y, R));
		

	}

}
