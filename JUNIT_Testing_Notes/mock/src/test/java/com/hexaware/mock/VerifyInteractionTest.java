package com.hexaware.mock;

import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;

class VerifyInteractionTest {
	
	@SuppressWarnings("unchecked")
	List<String>  mockedList =  Mockito.mock(List.class);
	

	@Test
	void test() {


		mockedList.add("first-element");
		mockedList.add("second-element");
		mockedList.add("third-element");
		mockedList.add("third-element");
		
		System.out.println(mockedList);
		//mockedList.clear();
		//System.out.println(mockedList);
		
		
		verify(mockedList).add("first-element");
		verify(mockedList).add("second-element");
		verify(mockedList , VerificationModeFactory.times(2)).add("third-element");
		
		
			
		
	}

}
