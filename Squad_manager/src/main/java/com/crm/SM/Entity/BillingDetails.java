package com.crm.SM.Entity;

import jakarta.persistence.*;

@Table
@Entity
public class BillingDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name",length=20,nullable=false)
	private String FirstName;
	
	@Column(name="second_name",length=20,nullable=false)
	private String SecondName;
	
	
	@Column(name="email",length=120,nullable=false)
	private String Email;	
	
	@Column(name="mobile",length=10,nullable=false)
	private String Mobile;
	
	@Column(name="company",length=500,nullable=false)
	private String Company;
	
	@Column(name="product",length=50,nullable=false)
	private String Product;
	
	@Column(name="amount",length=50,nullable=false)
	private String Amount;

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

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getProduct() {
		return Product;
	}

	public void setProduct(String product) {
		Product = product;
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}

}
