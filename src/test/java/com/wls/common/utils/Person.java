package com.wls.common.utils;

import java.util.Date;

/**
 * 
 * @ClassName: Person 
 * @Description: TODO
 * @author: MECHREVO
 * @date: 2020��2��28�� ����12:29:56
 */
public class Person {
    
	private String name;
	
	private Integer age;
	
	private String about;//����
	
	private Date created;//ע������

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", created=" + created + "]";
	}
	
	
	
	
}
