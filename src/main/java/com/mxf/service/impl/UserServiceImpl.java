package com.mxf.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mxf.bean.User;
import com.mxf.dao.UserDao;
import com.mxf.service.UserService;
/**
 * @author moxiaofei
 * @date 2017年12月13日 下午5:27:20
 *       业务服务层
 */
@Service
public class UserServiceImpl implements UserService{
	
	//按类型自动注入
	@Autowired
	private UserDao userDao;
	
	@Override
	public User findUser(String userName) {
		return userDao.findUser(userName);
	}

	@Override
	public List<User> queryAll() {
		return userDao.queryAll();
	}

}
