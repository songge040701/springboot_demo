package com.songge.sb_test.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
	private String userName;
	@Column(nullable = false)
	private String passWord;
	@Column(nullable = false)
	private String email;
	@Column(nullable = true)
	private String nickName;
	@Column(nullable = false)
	private String regTime;
	
	public User(String userName, String mail, String nickName, String password, String regTime) {
		this.userName = userName;
		this.email = mail;
		this.nickName = nickName;
		this.regTime = regTime;
		this.passWord = password;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public String getRegTime() {
		return regTime;
	}
	
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	

}
