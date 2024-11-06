package com.hexaware.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class CalcServiceTest2 {

	CalcService calcService;

	@Mock
	AddService addService;

	@BeforeEach
	public void setUp() {

		MockitoAnnotations.initMocks(this);

	}

	@Test
	void testCalc() {

		calcService = new CalcService(addService);

		System.out.println("testCalc() executed...");

		int n1 = 30;
		int n2 = 20;
		int expected = 50;

		when(addService.add(n1, n2)).thenReturn(expected);

		int actual = calcService.calc(n1, n2);

		assertEquals(expected, actual);

	}

}
