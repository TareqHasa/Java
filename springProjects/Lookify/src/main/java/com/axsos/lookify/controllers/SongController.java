package com.axsos.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsos.lookify.models.Song;
import com.axsos.lookify.services.SongService;

@Controller
public class SongController {
	private final SongService songService;

	public SongController(SongService songService) {
		this.songService = songService;
	}

	@RequestMapping("/")
	public String index() {
		return "song/index.jsp";
	}

	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = songService.allSongs();
		model.addAttribute("songs", songs);
		return "song/dash.jsp";
	}

	@RequestMapping("/songs/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Song song = songService.findSong(id);
		model.addAttribute("song", song);
		return "song/song.jsp";
	}

	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("song") Song song) {
		return "song/new.jsp";
	}

	@RequestMapping(value = "/songs/new", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if (result.hasErrors()) {
			return "song/new.jsp";
		} else {
			songService.createSong(song);
			return "redirect:/songs/new";
		}
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		songService.delete(id);
		return "redirect:/dashboard";
	}

	@RequestMapping("/search")
	public String searsh(@RequestParam("search") String search, Model model) {
		List<Song> song = songService.search(search);
		model.addAttribute("song", song);
		model.addAttribute("artist",search);
		return "song/search.jsp";
	}

}
