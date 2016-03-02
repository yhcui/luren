package com.mybatis.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * @author yhcui E-mail:cuiyh9@ziroom.com
 * @version 创建时间：Feb 29, 2016 11:27:54 AM
 * 类说明
 */
public class Generator {

	public static void main(String[] args) {
		try {
			List<String> warnings = new ArrayList<String>();  
			boolean overwrite = true;  
			File configFile = new File("src/main/resources/generator.xml");
			ConfigurationParser cp = new ConfigurationParser(warnings);  
			Configuration config = cp.parseConfiguration(configFile);  
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);  
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);  
			myBatisGenerator.generate(null); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
}
