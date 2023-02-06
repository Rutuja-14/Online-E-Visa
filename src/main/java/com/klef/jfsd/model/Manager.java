package com.klef.jfsd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="manager_table")
public class Manager 
{
  @Id
  @Column(nullable = false,length = 200)
  private String username;
  @Column(nullable = false,length = 200)
  private String password;
  @Column(nullable = false,length = 200)
  private String name;
 @Column(nullable = false,length = 10)
  private String gender;
 @Column(nullable = false,length = 10)
 private String dateofbirth;
 @Column(nullable = false,unique = true,length = 200)
 private String emailid;
 @Column(nullable = false,length = 200)
 private String contactno;
 @Column(nullable = false,length = 200)
 private String region;
 @Column(nullable = false,length = 200)
 private String state;

  
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(String dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getContactno() {
	return contactno;
}
public void setContactno(String contactno) {
	this.contactno = contactno;
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
public void setPassword(String password) {
  this.password = password;
}
@Override
public String toString() {
	return "Manager [username=" + username + ", password=" + password + ", name=" + name + ", gender=" + gender
			+ ", dateofbirth=" + dateofbirth + ", emailid=" + emailid + ", contactno=" + contactno + ", region="
			+ region + ", state=" + state + "]";
}
}