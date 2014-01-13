package net.test.domain;

import java.util.List;
import java.util.Map;

public class User {
	
	private String userName;
	private int age;
	private long UID;
	private List<Address> address;
	private Address taxAddress;
	private double stateTax;
	public double getStateTax() {
		return stateTax;
	}

	public void setStateTax(double stateTax) {
		this.stateTax = stateTax;
	}

	public Address getTaxAddress() {
		return taxAddress;
	}

	public void setTaxAddress(Address taxAddress) {
		this.taxAddress = taxAddress;
	}
	private double annualIncome;
	
	public User(String userName, int age, int uID) {
		super();
		this.userName = userName;
		this.age = age;
		UID = uID;
	}
	
	public User(String userName, int age, long uID,double annualIncome) {
		super();
		this.userName = userName;
		this.age = age;
		UID = uID;
		this.annualIncome = annualIncome;
	}
	
	
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> mAddress) {
		this.address = mAddress;
	}
	public long getUID() {
		return UID;
	}
	public void setUID(long uID) {
		UID = uID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDefaultAddressValue()
	 {
	  return "UNKNOWN";
	 }

}
