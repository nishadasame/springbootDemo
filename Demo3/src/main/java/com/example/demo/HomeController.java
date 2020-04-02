package com.example.demo;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.User;

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
	
	/*
	 * @RequestMapping("add") public ModelAndView add(@RequestParam("num1")int
	 * i,@RequestParam("num2")int j) {
	 * 
	 * ModelAndView mv = new ModelAndView(); mv.setViewName("add"); String obj =
	 * "Hi"; int num3 = i+j; mv.addObject("num3",num3); mv.addObject("obj",obj);
	 * return mv ; }
	 */
/*------------------------------------------------------------------------------	
	
	/*
	 * @RequestMapping("add") public String add(@RequestParam("id")int
	 * id,@RequestParam("name")String name,Model m) { User u = new User();
	 * u.setId(id); u.setName(name); m.addAttribute("user",u); return "add"; }
	 */
	
	
	//using model Atribute 
	
	
	//@RequestMapping("add")
	@PostMapping("add")
	public String add(@ModelAttribute User u,Model m)
	{
		m.addAttribute("user",u);
		
		return "add";
	}
	
	
	@GetMapping("getAlian")
	public String getUser(Model m)
	{
		List<User> u = Arrays.asList(new User(1,"abc"),new User(2,"xyz"));
		m.addAttribute("u",u);
		return "getAlian";
		
	}
	
}
