package com.fixiple.backendtrako.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fixiple.backendtrako.pojo.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}