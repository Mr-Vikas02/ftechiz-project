package com.ftechiz.project.service;

import com.ftechiz.project.entity.Contact;
import com.ftechiz.project.repository.ContactRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public List<Contact> getContactsByPostalCode(String postalCode) {
        return contactRepository.findByAddressPostalCode(postalCode);
    }

    @Transactional
    public Contact createContact(Contact contact) {
        Contact savedContact = contactRepository.save(contact);
        System.out.println("Contact created with ID: " + savedContact.getId());
        return savedContact;
    }

    @Transactional
    public List<Contact> saveBulkContacts(List<Contact> contacts){
        return contactRepository.saveAll(contacts);
    }

}

