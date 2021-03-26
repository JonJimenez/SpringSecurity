package com.example.SpringSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
	
	 @GetMapping("/user")
	    public String user() {
	        return ("<h1>Welcome User</h1>"+"<br>"+"<a href=\"logout\">Logout Here</a>");
	    }
}
