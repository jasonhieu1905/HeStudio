package com.hestudio.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hestudio.dao.ContactDAO;
import com.hestudio.model.Contact;

@Repository
public class ContactDAOImpl extends AbstractDAOImpl implements ContactDAO{
	
	public Contact getContactInfo() {
		@SuppressWarnings("unchecked")
		List<Contact> contacts = getSession().getNamedQuery("Contact.findAll").list();
		if(contacts.size() != 0){
			return contacts.get(0);
		}
		return null;
	}

	public void updateContactInfo(Contact contact) {
		getSession().update(contact);
	}

}
