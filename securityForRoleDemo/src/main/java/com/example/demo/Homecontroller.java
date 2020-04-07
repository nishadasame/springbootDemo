package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {

	@RequestMapping("/")
	public String home()
	{
		System.out.println("In controller ");
		return"index.jsp";
	}
}
