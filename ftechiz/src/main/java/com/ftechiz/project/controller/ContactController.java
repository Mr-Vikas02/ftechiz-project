package com.ftechiz.project.controller;

import com.ftechiz.project.ApiUrls;
import com.ftechiz.project.entity.Contact;
import com.ftechiz.project.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(ApiUrls.CONTACTS)
public class ContactController {
    private final Logger logger = LoggerFactory.getLogger(ContactController.class);
    private ContactService contactService;


    /** List of all contacts. */
    @GetMapping
    public ResponseEntity<List<Contact>> getAllContacts() {
        List<Contact> contacts = contactService.getAllContacts();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    /** List of contacts by postal code. */
    @GetMapping(params = "postalCode")
    public ResponseEntity<List<Contact>> getContactsByPostalCode(@RequestParam String postalCode) {
        logger.trace("getContactsByPostalCode: postalCode = {}", postalCode);
        List<Contact> contacts = contactService.getContactsByPostalCode(postalCode);
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    /** To save new contact. */
    @PostMapping
    public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
        logger.debug("createContact");
        contact = contactService.createContact(contact);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }

    /** To save list of new contacts. */
//    public ResponseEntity<?> saveBulkContacts(@RequestBody List<Contact> contacts){
//        if (contacts.isEmpty()){
//            return ResponseEntity.badRequest().body("Contact list can not be an empty.");
//        }
//            contacts = contactService.saveBulkContacts(contacts);
//            return ResponseEntity.ok(contacts);
//    }

    @Autowired
    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }
}


