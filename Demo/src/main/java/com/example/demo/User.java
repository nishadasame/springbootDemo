package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class User 
{
	@Autowired
	Client c;
	
	
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public User() {
		super();
	}
	
		public void code()
		{
			System.out.println("From User class");
			c.print();
		}
		

}
