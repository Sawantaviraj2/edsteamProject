package com.edsteam.service;

import java.util.List;

import com.edsteam.entity.Contact;

public interface ContactService {

	public Contact createContact(Contact contact);

	public List<Contact> getAllContact();

	public String deleteContact(Integer contactId);

}
