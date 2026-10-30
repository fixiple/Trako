package com.fixiple.backendtrako.pojo;

import java.time.ZonedDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


/**
*  The Task POJO contains relevant information about the task the person needs to do
*/
public class Task {

    private @Id 
    @GeneratedValue Long id;
    private String taskName;
    private ZonedDateTime dueOn;
    private boolean completed;


    public Task(String taskName, ZonedDateTime dueOn, boolean completed) {
        this.taskName = taskName;
        this.dueOn = dueOn;
        this.completed = completed;
    }

    public Task() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ZonedDateTime getDueOn() {
        return this.dueOn;
    }

    public void setDueOn(ZonedDateTime dueOn) {
        this.dueOn = dueOn;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}