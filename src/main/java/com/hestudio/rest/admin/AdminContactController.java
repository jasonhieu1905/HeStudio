package com.hestudio.rest.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hestudio.model.Contact;
import com.hestudio.service.ContactService;

@RestController
public class AdminContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value="/getContact",method = RequestMethod.GET)
	public ResponseEntity<Contact> getContactInfo(){
		
		Contact contact = contactService.getContactInfo();
		if(contact!= null){
			return new ResponseEntity<Contact>(contact,HttpStatus.OK);
		}
		return new ResponseEntity<Contact>(HttpStatus.NOT_FOUND);
	}
}
