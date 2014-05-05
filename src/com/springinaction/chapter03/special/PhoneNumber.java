package com.springinaction.chapter03.special;

public class PhoneNumber {

	private String areacode;
	
	private String prefix;
	
	private String number;

	public PhoneNumber(String areacode, String prefix, String number) {
		this.areacode = areacode;
		this.prefix = prefix;
		this.number = number;
	}

	public String getAreacode() {
		return areacode;
	}

	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "PhoneNumber [areacode=" + areacode + ", prefix=" + prefix
				+ ", number=" + number + "]";
	}
	
}
