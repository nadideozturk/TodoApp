package com.todoapp.service;

import com.todoapp.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void 	saveUser(User user);
}
