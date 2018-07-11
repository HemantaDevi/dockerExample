package com.accenture.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String goToHomePage() {
		return "home";
	}
	
	@GetMapping("/processing")
	public String loadPage(Model model, @RequestParam("name") String name) {
		model.addAttribute("name", name);
		return "home";
	}
	
}
