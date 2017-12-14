package com.springboot.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void addUser(UserRecord user){
		userRepository.save(user);
	}
	
	public List<UserRecord> getAllUser(){
		List<UserRecord> userRecord=new ArrayList<>();
		userRepository.findAll().forEach(userRecord::add);
		return userRecord;
	}
	
	public UserRecord getUser(String name){
		return userRepository.findOne(name);
	}
	
	public void deleteUser(String name){
		userRepository.delete(name);
	}
}
