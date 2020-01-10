package com.bridgelabz.JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bridgelabz.util.util;

class DayofweekTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		String ini=util.dayofweek(30, 06, 1997);
		 assertEquals(ini,"mon");
	}

}
