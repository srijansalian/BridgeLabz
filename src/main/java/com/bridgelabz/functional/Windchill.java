package com.bridgelabz.functional;

import com.bridgelabz.util.util;

public class Windchill {
	static void windchill(double v, double t) {
		if(t<50||t<120 && t>3) {
			
			
	        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
	        System.out.println("Temperature = " + t);
	        System.out.println("Wind speed  = " + v);
	        System.out.println("Wind chill  = " + w);
			}
			else
				System.out.println("Not valid ");
	    }
		
	

	public static void main(String[] args) {
		System.out.println("Enter the wind speed and tempatrure");
		double v=util.inputDouble();
		double t=util.inputDouble();
		windchill(v,t);
	
		

	}

}
