package com.fixiple.backendtrako.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fixiple.backendtrako.pojo.Task;
import com.fixiple.backendtrako.repository.TaskRepository;

@RestController 
public class TaskController {

    private final TaskRepository taskRepository;

    TaskController(TaskRepository repository) {
        this.taskRepository = repository;
    }
    
    @GetMapping("/tasks")
    List<Task> all() {
        return taskRepository.findAll();
    }

    
}
