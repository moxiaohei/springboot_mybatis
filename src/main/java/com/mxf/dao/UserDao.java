package com.mxf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.mxf.bean.User;

/**
 * @author moxiaofei
 * @date 2017年12月13日 下午5:26:12
 * 			数据访问层
 */
public interface UserDao {
	//根据用户名查找用户所有信息
//	@Select("select * from user_info where userName=#{userName}")
	User findUser(@Param("userName")String userName);
	//查询所有用户信息
	@Select("select * from user_info")
	List<User> queryAll();
}
