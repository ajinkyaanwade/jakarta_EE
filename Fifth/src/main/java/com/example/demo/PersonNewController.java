package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;
@Controller
public class PersonNewController
{

	// for welcome page "Home.html"

	@GetMapping("/")
	public String home()
	{
		return "Home";
	}
	@GetMapping("person")
	public String before()
	{
		return "personNew";
	}
	
	@PostMapping("person")
	public String afterSubmit(@RequestParam("name") String name,@RequestParam("address") String address,@RequestParam("age") long age,Model model) 
	{
		Person person=new Person();
		person.setName(name);
		person.setAddress(address);
		person.setAge(age);
		model.addAttribute("mb", person);
		return "success";
	}
}