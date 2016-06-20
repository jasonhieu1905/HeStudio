package com.hestudio.dao;

import com.hestudio.model.Contact;

public interface ContactDAO {

	public Contact getContactInfo();
	public void updateContactInfo(Contact contact);
	
}
