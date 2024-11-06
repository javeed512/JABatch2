package com.hexaware.junit5.test.suites;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.hexaware.junit5.Calculator;

public class SubstractionTest {

	
	@Tag("dev")
	@Test
	void subTest() {

		Calculator cal = new Calculator();
		
		assertEquals(0, cal.sub(5, 5));
		
	}

}
