package com.sys.pojo;

import java.util.List;

public class User {
	private int uid;
    private String username;
    private String password;
    private String usex;
    private String nickname;
    private Message message;//属性依赖
    private List<Phone> list;
    
    
	public User() {
		super();
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public User(int uid, String username, String password, String usex, String nickname, Message message) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.usex = usex;
		this.nickname = nickname;
		this.message = message;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", usex=" + usex
				+ ", nickname=" + nickname + ", message=" + message + ", list=" + list + "]\n";
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public List<Phone> getList() {
		return list;
	}
	public void setList(List<Phone> list) {
		this.list = list;
	}
	

}
