package com.my.spotify.api.service;

import com.my.spotify.api.domain.model.User;

public interface UserService {
	
	User findById(Long id);
	
	User create(User UserToCreate);
	
}
