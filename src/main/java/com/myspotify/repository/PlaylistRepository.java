package com.myspotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myspotify.model.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Long>{

}
