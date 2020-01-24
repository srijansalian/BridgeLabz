/*
 * Merge Sort of the String
 */
package com.bridgelabz.algorithm;

import com.bridgelabz.util.util;

public class MergeSort {

	public static void main(String[] args) {
		String a[] = util.inputString();
		int start = 0;
		int end = a.length - 1;/* Length */
		util.sort(a, start, end);/* Merge Sort operation of a string */

	}
}
