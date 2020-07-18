package com.SpringRestProject;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*Initialized and exposes http verbs to client AKA postman*/
@RestController
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(name="value", defaultValue = "World") String name) {
		
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	} 

}
