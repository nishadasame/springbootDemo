package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface RepoUser extends JpaRepository<User, Integer> {

}
