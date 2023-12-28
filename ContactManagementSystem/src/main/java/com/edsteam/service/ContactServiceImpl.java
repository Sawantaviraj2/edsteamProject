package com.edsteam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edsteam.entity.Contact;
import com.edsteam.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	private ContactRepository cr;

	@Autowired
	public ContactServiceImpl(ContactRepository cr) {
		super();
		this.cr = cr;
	}

	@Override
	public Contact createContact(Contact contact) {
		if (contact == null) {
			throw new RuntimeException("contact cannot be null");
		}
		return cr.save(contact);
	}

	@Override
	public List<Contact> getAllContact() {

		List<Contact> cList = cr.findAll();
		if (cList.isEmpty()) {
			throw new RuntimeException("Not Any contact Found");
		}
		return cList;
	}

	@Override
	public String deleteContact(Integer contactId) {
		Optional<Contact> contactById = cr.findById(contactId);
		if (contactById.isEmpty()) {
			throw new RuntimeException("contact does Not Exist");
		}
		cr.deleteById(contactId);
		return "contact deleted Successfully";
	}

}
