package com.hexaware.mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CalcServiceTest1 {

	@Test
	void testCalc() {

		CalcService calcService;
		AddService addService;

		addService = Mockito.mock(AddService.class);
			//addService = new AddServiceImp();
		calcService = new CalcService(addService);

		System.out.println("testCalc() executed...");

		int n1 = 10;
		int n2 = 20;
		int expected = 30;

		when(addService.add(n1, n2)).thenReturn(expected);

		int actual = calcService.calc(n1, n2);

		assertEquals(expected, actual);

	}

}
