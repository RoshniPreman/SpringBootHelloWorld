package com.helloworld.SpringBootHw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // This annotaton is applied to a class to mark it as a request handler.
@EnableAutoConfiguration // Configures dependencies needed for spring application.
public class Main {
	
	@RequestMapping("/")
	String Home() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
