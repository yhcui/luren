package com.luren.mockito;


import static org.mockito.Mockito.*;

import java.awt.List;

import org.junit.Test;

import static org.junit.Assert.*;

public class MockitoTest {

	
	@Test
	public void test(){
		List list = mock(List.class);
		list.add("1");
		list.add("2");
		
	}
}
