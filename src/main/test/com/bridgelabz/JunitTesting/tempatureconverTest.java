package com.bridgelabz.JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.util.util;

class tempatureconverTest {

	@Test
	void test() {
		float ini=util.celtofer(30);
		 assertEquals(ini,86.0);
		 float ini1=util.fertocel(86);
		 assertEquals(ini1,30.0);
	}

}
