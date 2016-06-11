package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.service.ITestService;

/**
 * @author yhcui E-mail:cuiyh9@ziroom.com
 * @version 创建时间：Feb 29, 2016 7:37:45 PM
 * 类说明
 */
@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private ITestService testService;
	
//	@RequestMapping(value="/str",produces = {"application/json;charset=UTF-8"})
	@RequestMapping("/str")
//	@RequestMapping(value="/str",produces = {"text/html;charset=UTF-8"})
	@ResponseBody
	public String str(){
		return "中文";
	}
	
	@RequestMapping("/page")
	public String page(){
		testService.test();
		return "test/page";
	}
}
