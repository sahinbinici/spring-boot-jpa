package com.springboot.jpa;

import javax.persistence.Entity;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<UserRecord,String>{

	
	
}
