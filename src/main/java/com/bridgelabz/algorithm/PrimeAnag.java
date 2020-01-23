package com.bridgelabz.algorithm;

import com.bridgelabz.util.util;

/*
 * To display the in the 2D array in the Prime and Anagram
 */
public class PrimeAnag {

	public static void main(String[] args) {

		for (int i = 0; i <= 1000; i++) {
			if (util.isPrime(i)) {/* Used to find out the given String is a Prime */
				for (int j = i; j < 1000; j++) {
					if (i != j && util.isPrime(j) && util.anagram(String.valueOf(i), String.valueOf(j))
							&& util.isPalindrome(i)) {

						System.out.println(i + " " + j);
					}

				}
			}

		}

	}

}
