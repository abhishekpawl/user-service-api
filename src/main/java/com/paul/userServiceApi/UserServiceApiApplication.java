package com.paul.userServiceApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApiApplication.class, args);
	}

	@GetMapping
	public String home() {
		return "</head><title>user-service-api</title></head><div style='margin-top: 40%;'><div style='text-align: center; margin-bottom: 2%;'><h2>user-service-api</h2></div>" +
				"<div style='text-align: center; margin-bottom: 2%;'><a href='https://github.com/abhishekpawl/user-service-api' target='_blank'>Github Repository</a></div>" +
				"<div style='text-align: center; margin-bottom: 2%;'><a href='./api/v1/users' target='_blank'>api/v1/users</a></div>" +
				"<div style='text-align: center;'>API testing: <a href='https://www.postman.com/' target='_blank'>Postman</a></div></div></div>";
	}

}
