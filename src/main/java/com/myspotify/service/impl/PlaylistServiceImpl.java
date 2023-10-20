package com.myspotify.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.myspotify.model.Playlist;
import com.myspotify.repository.PlaylistRepository;
import com.myspotify.service.PlaylistService;

@Service
public class PlaylistServiceImpl implements PlaylistService{

	private final PlaylistRepository playlistRepo;
	
	public PlaylistServiceImpl(PlaylistRepository playlistRepo) {
		this.playlistRepo = playlistRepo;
	}

	
	@Override
	public Playlist findById(Long id) {
		return playlistRepo.findById(id).orElseThrow(NoSuchElementException::new);
	}

}
