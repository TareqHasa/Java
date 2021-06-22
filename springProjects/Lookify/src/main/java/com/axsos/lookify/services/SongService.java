package com.axsos.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.lookify.models.Song;
import com.axsos.lookify.repositories.SongRepository;

@Service
public class SongService {
	private final SongRepository songRepository;

	public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}

	public List<Song> allSongs() {
		return (List<Song>) songRepository.findAll();
	}

	public Song createSong(Song song) {
		return songRepository.save(song);
	}

	public Song findSong(Long id) {
		Optional<Song> sonOptional = songRepository.findById(id);
		if (sonOptional.isPresent()) {
			return sonOptional.get();
		} else {
			return null;
		}
	}

	public void delete(Long id) {
		Optional<Song> optionalSong = songRepository.findById(id);
		if (optionalSong.isPresent()) {
			songRepository.deleteById(id);
		}
	}
	
	public List<Song> search(String search) {
		List<Song> song =songRepository.findByArtistContaining(search);
		return song;
	}

}
