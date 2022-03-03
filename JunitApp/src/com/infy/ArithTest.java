package com.infy;
import static org.junit.jupiter.api.Assertions.
*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class ArithTest {
	static  Arith arith;
	
	@Test
	void testAdd() {
		assertEquals(10,arith.add(4, 6));
	}
	@Test
	void testSub() {
		assertEquals(3,arith.sub(9, 6));
	}
	@Test
	void testCheck() {
		assertTrue(arith.check(22));
	}
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		arith=new Arith();
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		arith=null;
	}
	@BeforeEach
	void setUp() throws Exception {
		arith=null;
		System.out.println("test started");
	}
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("test case stopped");
	}
	

}
