package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Emp,Integer> {

	//Emp findbyUsername(String username);
	Emp findByUsername(String username);
}
