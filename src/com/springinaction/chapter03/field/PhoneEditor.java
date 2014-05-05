package com.springinaction.chapter03.field;

import java.beans.PropertyEditorSupport;

public class PhoneEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] ss = text.split(" ");
		PhoneNumber phone = new PhoneNumber(ss[0],ss[1],ss[2]);
		setValue(phone);
	}

	

}
