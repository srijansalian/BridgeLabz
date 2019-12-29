package com.bridgelabz.JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bridgelabz.util.util;

class MontlyPaymentTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		double ini=util.montlypayment(1000,6,10);
		 assertEquals(ini,"mon");
	}

}
