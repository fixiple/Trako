package com.fixiple.backendtrako.pojo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
*  The Contact POJO contains relevant information about the recruiter that's needed for the jobApplication 
*/
public class Contact {
    private @Id 
    @GeneratedValue Long id;
    private String name;
    private String email;
    private String phone;


    public Contact() {
    }

    public Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
}
