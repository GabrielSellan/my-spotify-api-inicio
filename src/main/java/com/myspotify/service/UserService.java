package com.myspotify.service;

import com.myspotify.model.User;

public interface UserService {
	
	User findById(Long id);
	
	User create(User UserToCreate);
	
}
