package com.study.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.study.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}