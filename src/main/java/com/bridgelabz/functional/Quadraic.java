package com.bridgelabz.functional;

import com.bridgelabz.util.util;

public class Quadraic {
	static void quadraic(double a ,double b, double c) {
		double delta=((b*b)-4*a*c);
		if(delta==0) {
			double result=(-b/(2*a));
			System.out.println("Result is"+result);
		}
			else
				if(delta>0) {
					double result1=(-b+Math.sqrt(delta)/(2*a));
					double result2=(-b-Math.sqrt(delta)/(2*a));
					System.out.println("Results are"+result1+"  "+result2);
					
				}
				else
					System.out.println("Roots are Complex");
		}

	public static void main(String[] args) {
		System.out.println("Enter the value of a");
		int a=util.inputInteger();
		System.out.println("Enter the value of b");
		int b=util.inputInteger();
		System.out.println("Enter the value of c");
		int c=util.inputInteger();
		quadraic(a,b,c);
		

	}

}
