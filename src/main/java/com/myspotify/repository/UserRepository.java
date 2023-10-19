package com.myspotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myspotify.model.User;



public interface UserRepository extends JpaRepository<User, Long>{

	boolean existsByName(String name);
	
}
