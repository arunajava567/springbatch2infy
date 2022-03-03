package com.infy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoanTest {

	@Test
	void testGetEmi() {
		Loan l=new Loan();
		Double emi=l.getEmi(12000.00);
		assertEquals(1000.00,emi);
		//fail("Not yet implemented");
	}

}
