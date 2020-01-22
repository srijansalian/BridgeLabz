/*
 * To Find out the Wind Chill 
 */
package com.bridgelabz.functional;

import com.bridgelabz.util.util;

public class Windchill {

	public static void main(String[] args) {
		System.out.println("Enter the wind speed and tempature");
		double v = util.inputDouble();
		double t = util.inputDouble();
		util.windchill(v, t);

	}

}
