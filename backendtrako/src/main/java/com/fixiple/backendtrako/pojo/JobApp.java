package com.fixiple.backendtrako.pojo;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


/**
*  The JobApplication POJO contains relevant information about a normal jobApplication process, including an optional tasks List") 
*/
public class JobApp {
    private @Id 
    @GeneratedValue Long id;
    private String name;
    private String description;
    private String webLink;
    private String status;
    private Contact contact;
    private List<Task> tasks;

    public JobApp() {
    }

    public JobApp( String name, String description, String webLink, String status, Contact contact, List<Task> tasks) {
        this.name = name;
        this.description = description;
        this.webLink = webLink;
        this.status = status;
        this.contact = contact;
        this.tasks = tasks;
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebLink() {
        return this.webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Contact getContact() {
        return this.contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }    


    public List<Task> getTasks() {
        return this.tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

}
