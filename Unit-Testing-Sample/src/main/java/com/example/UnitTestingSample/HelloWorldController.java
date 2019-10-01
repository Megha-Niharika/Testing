package com.example.UnitTestingSample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String helloworld()
	{
		return "helloworld!!!!";
	}
}
