package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.demo.mapper.UserMapper;
import com.mybatis.demo.model.User;
import com.spring.service.ITestService;

/**
 * @author yhcui E-mail:cuiyh9@ziroom.com
 * @version 创建时间：Feb 29, 2016 7:43:38 PM
 * 类说明
 */
@Service
public class TestServiceImpl implements ITestService{

	@Autowired
	private UserMapper userMapper;
	
	public void test() {
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user.getUser());
	}

}
