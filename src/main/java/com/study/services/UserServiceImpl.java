package com.study.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.model.User;
import com.study.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;

	@Override
	public List<User> findaAll() {
		return repo.findAll();
	}

	@Override
	public User findById(String id) {
		return repo.findById(id).get();
	}

	@Override
	public User save(User user) {
		return repo.save(user);
	}

	@Override
	public void deleteById(String id) {
		repo.deleteById(id);
	}

}
