package com.bridgelabz.functional;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import com.bridgelabz.util.util;

public class TwoDArray {

	public static void main(String[] args) {

		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		int a[][] = util.TwodArray();
		System.out.println("The values are ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				pw.println(a[i][j] + " ");
			}
		}
		pw.flush();

	}

}
