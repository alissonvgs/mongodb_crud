package com.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.model.User;
import com.study.services.UserServiceImpl;

@RequestMapping(value = "/users")
@RestController
public class UserController {

	@Autowired
	private UserServiceImpl serviceImpl;

	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody User dto) {
		User obj = serviceImpl.save(dto);
		return new ResponseEntity<User>(obj, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		 return new ResponseEntity<>(serviceImpl.findaAll(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> getUserById(@PathVariable String id){
		
		return ResponseEntity.ok().body(serviceImpl.findById(id));		
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<User> deleteById(@PathVariable String id){
		serviceImpl.deleteById(id);
		return ResponseEntity.noContent().build();
		
		
	}
	
	
	
	
}
