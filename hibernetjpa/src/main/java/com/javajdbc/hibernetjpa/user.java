package com.javajdbc.hibernetjpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class user {
@Id
@GeneratedValue
private int id;
@NotNull 
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
@NotNull
@Pattern(regexp="(\\d){3,3}-\\d{3,3}-\\d{4,4}",message="the phone number must match 111-111-1111 format")
private String phone;
}
