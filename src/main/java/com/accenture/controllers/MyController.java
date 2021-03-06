package com.accenture.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.accenture.entities.Voice;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String goToHomePage() {
		return "home";
	}
	
	@GetMapping("/processing")
	public String loadPage(Model model, @RequestParam("text") String text) {
		RestTemplate restTemplate = new RestTemplate();
        Voice voice = restTemplate.getForObject("https://api.Just2teach.com/speech?lang=en&text=" + text,Voice.class);
        model.addAttribute("speech", voice.getSpeech());
		return "home";
	}
	
}
