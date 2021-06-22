package com.axsos.lookify.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.axsos.lookify.models.Song;
import com.axsos.lookify.services.SongService;

@RestController
public class SongApi {
	private final SongService songService;

	public SongApi(SongService songService) {
		this.songService = songService;
	}

	@RequestMapping("/api/song")
	public List<Song> index() {
		return songService.allSongs();
	}

	@RequestMapping(value = "/api/song", method = RequestMethod.POST)
	public Song create(@RequestParam(value = "title") String title, @RequestParam(value = "artist") String artist,
			@RequestParam(value = "rate") Integer rate) {
		Song song = new Song(title, artist, rate);
		return songService.createSong(song);
	}
    @RequestMapping("/api/books/{id}")
    public Song show(@PathVariable("id") Long id) {
        Song song = songService.findSong(id);
        return song;
    }
}


