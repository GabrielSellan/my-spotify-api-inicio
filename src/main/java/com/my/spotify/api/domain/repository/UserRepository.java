package com.my.spotify.api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.spotify.api.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	boolean existsByUserName(String name);
	
}
