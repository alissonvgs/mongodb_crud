package com.study.services;

import java.util.List;

import com.study.model.User;

public interface UserService {

	List<User> findaAll();

	User findById(String id);

	User save(User user);
	
	void deleteById(String id);

}
