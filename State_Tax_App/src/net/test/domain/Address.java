package net.test.domain;

public class Address {
	

	public Address(String key, String state) {
		super();
		this.key = key;
		this.state = state;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String key;
	private String state;

	

}
