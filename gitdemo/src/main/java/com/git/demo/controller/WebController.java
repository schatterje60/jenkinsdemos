package com.git.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController
{

	@RequestMapping("/greet")
	public String sayHello()
	{
		return "hello !!";
	}
}
