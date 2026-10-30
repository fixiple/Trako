package com.fixiple.backendtrako.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fixiple.backendtrako.pojo.User;
import com.fixiple.backendtrako.repository.UserRepository;

@RestController 
public class UserController {
   
    private final UserRepository userRepository;

    UserController(UserRepository repository) {
        this.userRepository = repository;
    }

    @GetMapping("/users")
    List<User> all() {
        return userRepository.findAll();
    }
}
