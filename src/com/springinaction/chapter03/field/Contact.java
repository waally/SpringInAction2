package com.springinaction.chapter03.field;

public class Contact {

	private PhoneNumber phoneNumber;
	
	public Contact() {
	}

	public Contact(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
