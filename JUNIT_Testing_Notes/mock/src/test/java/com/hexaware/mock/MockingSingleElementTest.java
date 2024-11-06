package com.hexaware.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MockingSingleElementTest {

	@Test
	void test() {


		ArrayList<String>  mockedList = Mockito.mock(ArrayList.class); 
		
		when(mockedList.get(0)).thenReturn("first-element");
		when(mockedList.get(1)).thenReturn("second-element");
		
		System.out.println(mockedList.get(0));  // first-element
		
		assertEquals("first-element", mockedList.get(0));
		
		assertEquals("second-element", mockedList.get(1));
		
		System.out.println(mockedList.get(1)); // second element 
		
		
		
	}

}
