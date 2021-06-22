package com.axsos.lookify.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.axsos.lookify.models.Song;

public interface SongRepository extends CrudRepository<Song, Long> {
	List<Song>  findByArtistContaining(String artist);
}
