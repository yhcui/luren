package com.spring.service.impl;

import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mybatis.demo.mapper.UserMapper;
import com.mybatis.demo.model.User;
import com.spring.service.ITestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-servlet.xml"})
public class TestServiceImplMockTest extends AbstractJUnit4SpringContextTests {
	
	@Autowired
	@InjectMocks
	private ITestService testService; 
	
	
	@Mock
	private UserMapper userMapper;
	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testTest(){
		User user = new User();
		user.setUser("张");
		when(userMapper.selectByPrimaryKey(1)).thenReturn(user);
		testService.test();
	}

}
