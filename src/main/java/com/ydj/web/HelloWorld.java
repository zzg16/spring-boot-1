package com.ydj.web;

import java.io.Serializable;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping("/")
	String home() {
		return "Hello World! zzg";
	}

	@RequestMapping("/get/json")
	User getJson() {
		return new User(1L, "zzg16", 28);
	}

}

class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1654316014223985551L;
	private Long id;
	private String name;
	private Date birthday;
	private Integer age;

	public User(Long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.birthday = new Date();
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}