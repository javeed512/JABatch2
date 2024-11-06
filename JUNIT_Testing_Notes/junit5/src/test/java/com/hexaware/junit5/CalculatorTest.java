package com.hexaware.junit5;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {

	static Calculator cal;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		out.println("Before All");

		cal = new Calculator();

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {

		out.println("After All");

	}

	@BeforeEach
	void setUp() throws Exception {

		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {

		System.out.println("After Each");
	}

	@Test
	@DisplayName("AddTest")
	void testAdd() {

		int actual = cal.add(5, 5);

		assertEquals(10, actual);

		System.out.println("add tested");

	}

	@Test
	@DisplayName(":)")
	void testSub() {

		int actual = cal.sub(5, 5);

		assertTrue(actual == 0);

		System.out.println("sub tested");

	}

	@Test
	@Disabled
	void testMul() {

		int actual = cal.mul(4, 3);

		assertNotEquals(10, actual);
		System.out.println("mul tested");
	}

	@Test
	void testDiv() {

		int actual = cal.div(5, 5);

		assertFalse(actual > 1);

		System.out.println("div tested");
	}

	@ParameterizedTest
	@ValueSource(strings = { "apple", "mango", "banana", "kiwi" })
	void testWithParameters(String name) {

		assertTrue(name.length() > 3);
		System.out.println("string length tested");

	}

	@RepeatedTest(3)
	void repeatTest() {

		assertTrue(5 > 2);

	}

	/*
	 * @ExtendWith(RandomParametersExtension.class)
	 * 
	 * @Test void test(@Random int i) {
	 * 
	 * }
	 */

}
