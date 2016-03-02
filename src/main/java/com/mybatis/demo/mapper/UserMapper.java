package com.mybatis.demo.mapper;

import java.util.List;

import com.mybatis.demo.model.User;



public interface UserMapper {

    User selectByPrimaryKey(int id);
    
    List<User> selectList();
    
    void addUser(User user);
    
    int updateUser(User user);
    
    int deleteUser(int  id); 

}