package com.fixiple.backendtrako.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fixiple.backendtrako.pojo.JobApp;
import com.fixiple.backendtrako.repository.JobAppRepository;


@RestController 
public class JobAppController {
    private final JobAppRepository jobAppRepository;

    JobAppController(JobAppRepository repository) {
        this.jobAppRepository = repository;
    }

    @GetMapping("/jobapps")
    List<JobApp> all() {
        return jobAppRepository.findAll();
    }


    @GetMapping("/")
    public String getJobApp(){
        return "";
    }
}
