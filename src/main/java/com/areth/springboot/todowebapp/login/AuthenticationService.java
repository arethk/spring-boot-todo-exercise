package com.areth.springboot.todowebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	private static final String USERNAME = "areth";
	private static final String PASSWORD = "areth";

	public boolean authenticate(String username, String password) {
		return username.equalsIgnoreCase(USERNAME) && password.equalsIgnoreCase(PASSWORD);
	}
}
