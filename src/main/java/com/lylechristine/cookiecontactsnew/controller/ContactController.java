package com.lylechristine.cookiecontactsnew.controller;

import com.lylechristine.cookiecontactsnew.model.Contact;
import com.lylechristine.cookiecontactsnew.repository.ContactRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Contact updateUser(@PathVariable("id") Contact contact) {
        LOG.info("Updating contact ");
        return contactRepository.save(contact);
    }

    @PostMapping()
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
