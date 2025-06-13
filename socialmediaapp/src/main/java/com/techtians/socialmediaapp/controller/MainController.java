package com.techtians.socialmediaapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping(value = "/signup")
	public String test()
	{
		return "this is testing";
	}
}
