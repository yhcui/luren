package com.spring.service.impl;

import javax.annotation.Resource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.service.ITestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-servlet.xml"})
public class TestServiceImplTest extends AbstractJUnit4SpringContextTests {
	
	@Autowired
	private ITestService testService; 
	
	@Before
	public void init(){
		
	}
	
	@Test
	public void testTest(){
		testService.test();
	}

}
