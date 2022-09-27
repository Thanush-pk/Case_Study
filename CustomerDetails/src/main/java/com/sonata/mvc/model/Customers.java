package com.sonata.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {
	@Id
	private String custName;
	private int custPhoneno;
	private String custEmail;
	private String custAddress;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustPhoneno() {
		return custPhoneno;
	}
	public void setCustPhoneno(int custPhoneno) {
		this.custPhoneno = custPhoneno;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public Customers(String custName, int custPhoneno, String custEmail, String custAddress) {
		//super();
		this.custName = custName;
		this.custPhoneno = custPhoneno;
		this.custEmail = custEmail;
		this.custAddress = custAddress;
	}
	
	public Customers() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	

}
