package com.bridgelabz.JunitTesting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bridgelabz.util.util;

class toBinaryTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		int expected[]= {0,0,0,0,1,0,1,0};
		int[] actual=util.binary(10);
		
		assertArrayEquals(expected, actual);
		
	}

}
