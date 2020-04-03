package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user", schema = "public")
public class User {
	
	@Id
	private int id;
	private String name;
	
	

	public User() {
		super();
	}
	
	
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
	
	

}




/*spring.datasource.url=jdbc:postgres://locahost:5432/Mydb

spring.datasource.data-username=postgresSQL

spring.datasource.data-password=manager
	
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgresDialect*/