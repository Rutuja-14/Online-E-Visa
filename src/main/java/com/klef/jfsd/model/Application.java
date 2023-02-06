package com.klef.jfsd.model;



import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "application_table")
public class Application 
{
	@Id
	  @GeneratedValue
	   private int id;
	  @Column(nullable = false,length = 200)
	   private String name;
	  @Column(nullable = false,length = 10)
	   private String gender;
	  @Column(nullable = false,length = 10)
	  private String dateofbirth;
	  @Column(nullable = false,unique = true,length = 200)
	   private String email;
	  @Column(nullable = false,length = 200)
	   private String passporttype;
	  @Column(nullable = false,unique = true,length = 200)
	  private String passportnumber;
	  @Column(nullable = false,length = 200)
	   private String nationality;
	  @Column(nullable = false,length = 200)
	   private String visaservice;
	  @Column(nullable = false,length = 200)
	  private String destination;
	  @Column(nullable = false,length = 200)
	  private String portofarrival;
	  @Column(nullable = false)
	  private Blob Proofs;
	  
	  @Column(nullable = false)
	  private String status;
	  
	  
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Blob getProofs() {
		return Proofs;
	}
	public void setProofs(Blob proofs) {
		Proofs = proofs;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassporttype() {
		return passporttype;
	}
	public void setPassporttype(String passporttype) {
		this.passporttype = passporttype;
	}
	public String getPassportnumber() {
		return passportnumber;
	}
	public void setPassportnumber(String passportnumber) {
		this.passportnumber = passportnumber;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getVisaservice() {
		return visaservice;
	}
	public void setVisaservice(String visaservice) {
		this.visaservice = visaservice;
	}
	@Override
	public String toString() {
		return "Application [id=" + id + ", name=" + name + ", gender=" + gender + ", dateofbirth=" + dateofbirth
				+ ", email=" + email + ", passporttype=" + passporttype + ", passportnumber=" + passportnumber
				+ ", nationality=" + nationality + ", visaservice=" + visaservice + ", destination=" + destination
				+ ", portofarrival=" + portofarrival + ", Proofs=" + Proofs + ", status=" + status + "]";
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getPortofarrival() {
		return portofarrival;
	}
	public void setPortofarrival(String portofarrival) {
		this.portofarrival = portofarrival;
	}
}
