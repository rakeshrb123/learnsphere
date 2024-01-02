package com.learnSphere.services;

import com.learnSphere.entity.Users;

public interface UserService {
	//adds new user to database
	String addUser(Users user);
	//checks email is already present in database or not
	boolean checkEmail(String email);
	//check email matching with correct password
	boolean valid(String email,String password);
	//get user's role by providing email
	String getUserRole(String email);

}