package com.infy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class ArithTest2 {

	@Test
	@RepeatedTest(5)

	void testCheck() {
		assertTrue(new Arith().check(23));
	}

}
