package com.springboot.jpa;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private UserService userService;
	
	@RequestMapping("/")
	public List<UserRecord> getAllUser(){
		return userService.getAllUser();
	}
	
	@RequestMapping(value="/user/name", method=RequestMethod.GET)
	public UserRecord getUser(String name){
		return userService.getUser(name);
	}
	
	@RequestMapping(value="/add-user",method=RequestMethod.POST)
	public void addUser(@RequestBody UserRecord user){
		userService.addUser(user);
	}
}
