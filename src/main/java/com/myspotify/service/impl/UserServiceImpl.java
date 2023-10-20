package com.myspotify.service.impl;

import java.util.NoSuchElementException;


import org.springframework.stereotype.Service;

import com.myspotify.model.Playlist;
import com.myspotify.model.User;
import com.myspotify.repository.UserRepository;
import com.myspotify.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		if(userRepository.existsByName(userToCreate.getName())) {
			throw new IllegalArgumentException("Esse nome de úsuario já está sendo utilizado");
		}
		return userRepository.save(userToCreate);
	}

}
