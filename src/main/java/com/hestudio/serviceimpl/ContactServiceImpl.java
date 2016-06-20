package com.hestudio.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hestudio.dao.ContactDAO;
import com.hestudio.model.Contact;
import com.hestudio.service.ContactService;

@Service
@Transactional
public class ContactServiceImpl implements ContactService{
	
	private ContactDAO contactDAO;
	
	public void setContactDAO(ContactDAO contactDAO) {
		this.contactDAO = contactDAO;
	}

	public Contact getContactInfo() {
		return contactDAO.getContactInfo();
	}

	public void updateContactInfo(Contact contact) {
		contactDAO.updateContactInfo(contact);
	}

}
