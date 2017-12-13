package com.mxf.service;

import java.util.List;

import com.mxf.bean.User;

public interface UserService {
	//根据用户名查找用户
	User findUser(String userName);
	//查询所有用户信息
	List<User> queryAll();
}
