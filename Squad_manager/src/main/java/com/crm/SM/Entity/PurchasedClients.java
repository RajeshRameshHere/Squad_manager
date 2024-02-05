package com.crm.SM.Entity;

import jakarta.persistence.*;
@Table
@Entity
public class PurchasedClients {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name",length=20,nullable=false)
	private String FirstName;
	
	@Column(name="second_name",length=20,nullable=false)
	private String SecondName;
	
	
	@Column(name="email",length=120,nullable=false,unique=true)
	private String Email;	
	
	@Column(name="mobile",length=10,nullable=false,unique=true)
	private String Mobile;
	
	@Column(name="company",length=500,nullable=false)
	private String Company;
	
	@Column(name="source",length=50,nullable=false)
	private String Source;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getSecondName() {
		return SecondName;
	}
	public void setSecondName(String secondName) {
		SecondName = secondName;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}

	

}
