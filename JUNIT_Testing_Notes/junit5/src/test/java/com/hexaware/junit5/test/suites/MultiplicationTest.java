package com.hexaware.junit5.test.suites;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.hexaware.junit5.Calculator;
@Tag("MTag")
public class MultiplicationTest {

	@Tag("production")
	@Test
	void mulTest() {
		Calculator cal = new Calculator();
		
		assertEquals(25, cal.mul(5, 5));
	}

}
