package com.hestudio.service;

import com.hestudio.model.Contact;

public interface ContactService {
	public Contact getContactInfo();
	public void updateContactInfo(Contact contact);
}
