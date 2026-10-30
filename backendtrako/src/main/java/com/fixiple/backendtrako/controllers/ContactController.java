package com.fixiple.backendtrako.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fixiple.backendtrako.pojo.Contact;
import com.fixiple.backendtrako.repository.ContactRepository;

@RestController 
public class ContactController {
   
    private final ContactRepository contactRepository;

    ContactController(ContactRepository repository) {
        this.contactRepository = repository;
    }

    @GetMapping("/contacts")
    List<Contact> all() {
        return contactRepository.findAll();
    }
}
