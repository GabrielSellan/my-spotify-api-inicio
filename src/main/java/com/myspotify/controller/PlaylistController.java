package com.myspotify.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspotify.model.Song;
import com.myspotify.service.PlaylistService;

@RestController
@RequestMapping("/users/playlist")
public class PlaylistController {
	
	private final PlaylistService playlistService;

	public PlaylistController(PlaylistService playlistService) {
		this.playlistService = playlistService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<List<Song>> findById(@PathVariable Long id){
		var playlist = playlistService.findById(id);
		return ResponseEntity.ok(playlist.getSongs());
	}
	
	
}
