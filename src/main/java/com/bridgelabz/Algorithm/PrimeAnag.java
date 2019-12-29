package com.bridgelabz.Algorithm;

import com.bridgelabz.util.util;

public class PrimeAnag {

	public static void main(String[] args) {
		 
			
			for (int i = 0; i <= 1000; i++) {
				if (util.isPrime(i)) {
					for (int j = i; j < 1000; j++) {
						if (i != j) {
							if (util.isPrime(j)) {
								if (util.anagram(String.valueOf(i), String.valueOf(j)) && util.isPalindrome(i)) {
									System.out.println(i + " " + j  );
								}
							}
						}
					}

				}


	}

	}
}
