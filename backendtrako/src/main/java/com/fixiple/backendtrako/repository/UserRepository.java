package com.fixiple.backendtrako.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fixiple.backendtrako.pojo.User;

public interface UserRepository extends JpaRepository<User, Long> {

}