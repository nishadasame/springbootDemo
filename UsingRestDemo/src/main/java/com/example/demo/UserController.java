package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

//@Controller
@RestController
public class UserController
{
	@Autowired
	RepoUser repo;
	
	
	@GetMapping("users")
	//@ResponseBody
	public List<User> home()
	{
		
	List<User> users=	repo.findAll();
	
		return users;
				
	}

	@GetMapping("users/{id}")
	//@ResponseBody
	public User getUserById(@PathVariable("id") int id)
	{
		User u = repo.findById(id).orElse(new User(0,""));
		return u;
		
	}
	
	@PostMapping("users")
	public User addUser(User u)
	{
		repo.save(u);
		return u;
	}
}
