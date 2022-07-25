package com.kh.user.dto;

import java.sql.Timestamp;

public class UserDto {
	
	public UserDto() {
		
	}
	
	public UserDto(int no, String id, String pwd, String nick, Timestamp enrollDate) {
		super();
		this.no = no;
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
		this.enrollDate = enrollDate;
	}
	
	private int no;
	private String id;
	private String pwd;
	private String nick;
	private Timestamp enrollDate;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public Timestamp getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(Timestamp enrollDate) {
		this.enrollDate = enrollDate;
	}
	@Override
	public String toString() {
		return "UserDto [no=" + no + ", id=" + id + ", pwd=" + pwd + ", nick=" + nick + ", enrollDate=" + enrollDate
				+ "]";
	}
	
	

}
