package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home()
	{
		System.out.println("In home  controller and home method");
		
		return "home";
		
		
	}
	
	/*
	 * @RequestMapping("add") public String add(@RequestParam("num1")int
	 * i,@RequestParam("num2")int j,HttpSession s) { int num3 = i+j;
	 * s.setAttribute("num3", num3); return "add.jsp" ; }
	 */
	
	//using model and view
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1")int i,@RequestParam("num2")int j)
	{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("add");
		String obj = "Hi";
		int num3 = i+j;
		mv.addObject("num3",num3);
		mv.addObject("obj",obj);
		return mv ;
	}
	
}
