package com.kh.member.vo;

import java.sql.Timestamp;

public class MemberVo {
	
	public MemberVo() {
		
	}
	
	
	
	public MemberVo(int no, String id, String pwd, String name, String phone, String email, String addr,
			String interest, Timestamp enrollDate, Timestamp modifyDate, String status) {
		this.no = no;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.addr = addr;
		this.interest = interest;
		this.enrollDate = enrollDate;
		this.modifyDate = modifyDate;
		this.status = status;
	}
	 
	//회원가입시 사용하는 생성자
	public MemberVo(String memberId, String memberPwd, String memberPwd2, String memberName, String memberPhone, String memberEmail,
			String memberAddr, String memberInterest) {
		
		this.id = memberId;
		this.pwd = memberPwd;
		this.pwd2 = memberPwd2;
		this.name = memberName;
		this.phone = memberPhone;
		this.email = memberEmail;
		this.addr = memberAddr;
		this.interest = memberInterest;
	}

	 private int no;
     private String id;
     private String pwd;
     private String pwd2;
     private String name;
     private String phone;
     private String email;
     private String addr;
     private String interest;
     private Timestamp enrollDate;
     private Timestamp modifyDate;
     private String status;
	public int getNo() {
		return no;
	}
	
	
	
	
	
	public String getPwd2() {
		return pwd2;
	}

	public void setPwd2(String pwd2) {
		this.pwd2 = pwd2;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public Timestamp getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(Timestamp enrollDate) {
		this.enrollDate = enrollDate;
	}
	public Timestamp getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", phone=" + phone + ", email="
				+ email + ", addr=" + addr + ", interest=" + interest + ", enrollDate=" + enrollDate + ", modifyDate="
				+ modifyDate + ", status=" + status + "]";
	}
     
     

}
