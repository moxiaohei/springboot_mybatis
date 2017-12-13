package com.mxf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mxf.bean.User;
import com.mxf.service.UserService;

/**
 * @author moxiaofei
 * @date 2017年12月13日 下午5:28:11
 * 			业务处理层
 */
@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/getUser")
	public User createUser(@RequestParam(value="userName",required=true)String userName){
		return service.findUser(userName);
	}
	
	@RequestMapping("/quaryAll")
	public List<User> quaryAll(){
		return service.queryAll();
	}
	
}
