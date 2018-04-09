package com.in28minutes.login;

public class LoginService {

	public boolean isUserValid(String name, String password) {
		// TODO Auto-generated method stub
		if (name.equals("shafeeque") && password.equals("hallo"))
			return true;
			
		return false;
	}

}
