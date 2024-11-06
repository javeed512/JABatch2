package com.hexaware.mock;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;

class MockitoSpyTest {
	
	/*
	 * @Spy List<String> spyList = new ArrayList<String>();
	 */

	@Test
	@Disabled
	void test() {
		
		List list = new ArrayList<>(4);
		List listSpy = spy(list);

		
		System.out.println(listSpy);
		
		  listSpy.add("first-element");
		  
		  System.out.println(listSpy);
		  
		  System.out.println(listSpy.get(0));
		  
		 // assertEquals("first-element", listSpy.get(0));
		 
		
		
		when(listSpy.get(0)).thenReturn("second-element");
		System.out.println(listSpy.get(0));
		assertEquals("second-element", listSpy.get(0));
		
		
		
		
	}
	
	
	List<String> list = new ArrayList<String>();
	
	@Spy
	 List<String> spyList ;
	
	@Test
	void givenUsingSpyMethod_whenSpyingOnList_thenCorrect() {
	    
	   

	    spyList.add("one");
	    spyList.add("two");

	    verify(spyList).add("one");
	    verify(spyList).add("two");

	     assertTrue(spyList.size() > 0);
	}

}
