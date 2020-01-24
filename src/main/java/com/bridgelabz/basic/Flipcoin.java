package com.bridgelabz.basic;

import com.bridgelabz.util.util;
import java.util.logging.Logger;

public class Flipcoin {
	static Logger logger = Logger.getLogger(Flipcoin.class.getName());

	static void flip(int n) {

		int head = 0;
		int tail = 0;
		for (int i = 1; i <= n; i++) {
			double z = Math.random();

			if (z < 0.5)
				head += head;
			else
				tail++;
		}
		int a = (tail * 100) / n;
		int b = 100 - a;
		logger.info("Tail is " + a);
		logger.info("Head is " + b);

	}

	public static void main(String[] args) {
		logger.info("Enter Number of tines the coin must be Fliped");
		int n = util.inputInteger();
		flip(n);

	}

}
