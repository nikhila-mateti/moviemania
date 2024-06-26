package com.example.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MovieManiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieManiaApplication.class, args);
	}
}

//@RestController
//@RequestMapping("/api")
//class HelloWorldController {
//	@GetMapping("/hello")
//	public String helloWorld() {
//		return "Hello, World!";
//	}
//}