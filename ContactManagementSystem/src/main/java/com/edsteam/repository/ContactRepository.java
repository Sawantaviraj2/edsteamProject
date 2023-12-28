package com.edsteam.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edsteam.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

	Optional<Contact> findByPhoneNumber(String phoneNumber);
}
