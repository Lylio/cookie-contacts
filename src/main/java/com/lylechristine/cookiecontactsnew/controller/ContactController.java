package com.lylechristine.cookiecontactsnew.controller;

import com.lylechristine.cookiecontactsnew.model.Contact;
import com.lylechristine.cookiecontactsnew.repository.ContactRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping ("/api/contacts")
public class ContactController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());
    @Autowired
    private ContactRepository contactRepository;

    @GetMapping()
    public List<Contact> getAllContacts() {
        LOG.info("Listing all contacts.");
        return contactRepository.findAll();
    }

    @GetMapping("/{id}")
    public Contact getContact(@PathVariable("id") String id) {
        LOG.info("Getting contact (ID = " + id + ")");
        return contactRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contact> updateUser(@PathVariable("id") String id, @RequestBody Contact contact) {
        LOG.info("Updating contact (ID = " + id + ")");
        Optional<Contact> contactData = contactRepository.findById(id);
        if (contactData.isPresent()) {
            Contact _contact = contactData.get();
            _contact.setFirstName(contact.getFirstName());
            _contact.setLastName(contact.getLastName());
            _contact.setEmailAddress(contact.getEmailAddress());
            _contact.setPhoneNumber(contact.getPhoneNumber());
            _contact.setJobTitle(contact.getJobTitle());
            _contact.setCompany(contact.getCompany());
            _contact.setProfileLink(contact.getProfileLink());

            return new ResponseEntity<>(contactRepository.save(_contact), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public Contact createContact(@RequestBody Contact contact) {
        LOG.info("Creating a new contact.");
        return contactRepository.save(contact);
    }

    @DeleteMapping("/{id}")
    public String deleteContact(@PathVariable String id) {
        contactRepository.deleteById(id);
        LOG.info("Deleting a single contact.");
        return id + " successfully deleted";
    }
}
