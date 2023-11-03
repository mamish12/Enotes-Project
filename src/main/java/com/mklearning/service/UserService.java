package com.mklearning.service;

import com.mklearning.entity.User;

public interface UserService {
	public User saveUser(User user);
	
	public boolean existEmailCheck(String email);

}
