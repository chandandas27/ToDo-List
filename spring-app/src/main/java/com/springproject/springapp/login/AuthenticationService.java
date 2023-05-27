package com.springproject.springapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {

		boolean isValidUserName = username.equalsIgnoreCase("name");
		boolean isValidPassword = username.equalsIgnoreCase("name");

		return isValidUserName && isValidPassword;

	}

}
