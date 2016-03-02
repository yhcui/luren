package com.mybatis.demo.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.demo.mapper.UserMapper;
import com.mybatis.demo.model.User;

/**
 * @author yhcui E-mail:cuiyh9@ziroom.com
 * @version 创建时间：Feb 29, 2016 3:36:34 PM
 * 类说明
 */
public class TestUser {


	private static SqlSession session;
	
	static{
		//mybatis的配置文件
        String resource = "mybatis-config.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = TestUser.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        session = sessionFactory.openSession();
	}
	
	public static void main(String[] args) {
//		addUser();
		deleteUser();
	}
	
	public static void test1(){
		
        String statement = "com.mybatis.demo.mapper.UserMapper.selectByPrimaryKey";//映射sql的标识字符串
        User user = session.selectOne(statement, 1);
        System.out.println(user);
	}
	
	public static void test2(){
        
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
	}
	
	
	public static void queryUser(){
		UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> userList = userMapper.selectList();
        System.out.println(userList);
	}
	
	public static void addUser(){
		User user = new User();
		user.setUser("cd");
		UserMapper userMapper = session.getMapper(UserMapper.class);
		userMapper.addUser(user);
		session.commit();
		System.out.println("uu:"+user.getId());
	}
	
	public static void updateUser(){
		User user = new User();
		user.setId(8);
		user.setUser("cd");
		UserMapper userMapper = session.getMapper(UserMapper.class);
		int count = userMapper.updateUser(user);
		session.commit();
		System.out.println("count:"+count);
	}
	
	public static void deleteUser(){
		User user = new User();
		user.setId(8);
		user.setUser("cd");
		UserMapper userMapper = session.getMapper(UserMapper.class);
		int count = userMapper.deleteUser(1);
		session.commit();
		System.out.println("count:"+count);
	}
	
	

}
