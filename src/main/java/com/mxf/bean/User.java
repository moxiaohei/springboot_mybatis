package com.mxf.bean;

/**
 * @author moxiaofei
 * @date 2017年12月13日 下午5:23:36
 * 			User实体类
 */
public class User {
	
	private Integer id;//编号
	private String userName;//用户名
	private String passWord;//密码
	
	public User() {
	}
	public User(Integer id, String userName, String passWord) {
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + "]";
	}
	
}