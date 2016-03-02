package com.mybatis.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mybatis.demo.mapper.UserMapper;
import com.mybatis.demo.model.User;

/**
 * @author yhcui E-mail:cuiyh9@ziroom.com
 * @version 创建时间：Feb 29, 2016 6:41:17 PM
 * 类说明
 */
public class TestSpring {

	private static ApplicationContext ctx;
	
	static{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
	}
	
	public static void main(String[] args) {
		addUser();
	}
	public static void addUser(){
		User user = new User();
		user.setUser("cuiyh");
		UserMapper userMapper = (UserMapper)ctx.getBean("userMapper");
		userMapper.addUser(user);
	}
}
