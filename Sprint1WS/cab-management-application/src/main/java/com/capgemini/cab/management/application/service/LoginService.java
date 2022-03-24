package com.capgemini.cab.management.application.service;

import com.capgemini.cab.management.application.domain.Login;

public interface LoginService {

	/*
	 * This login method asks for username and password to check the login details in repo, if not valid, then page remains unlogged
	 * @param (username, password)
	 * 
	 */
	  public Login login(String username, String password);
	  
}
