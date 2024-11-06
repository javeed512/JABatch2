package com.hexaware.junit5.test.suites;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.hexaware.junit5.Calculator;

public class AdditionTest {

	@Tag("dev")
	@Tag("production")
	@Test
	void addTest() {

			Calculator cal = new Calculator();
			
			assertEquals(10, cal.add(5, 5));
		
		
	}

}
