package com.example.sanjeev25dec_ms_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sanjeev25decMsJavaApplication {
	public static void main(String[] args) {
		SpringApplication.run(Sanjeev25decMsJavaApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello from ms arpit: %s!", name);
	}
}
