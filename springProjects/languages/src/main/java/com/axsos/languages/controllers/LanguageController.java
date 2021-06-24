package com.axsos.languages.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.axsos.languages.models.Language;
import com.axsos.languages.services.LanguageService;

@Controller
public class LanguageController {
	private LanguageService languageService;

	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@RequestMapping("/")
	public String root() {
		return "redirect:/languages";
	}

	@RequestMapping("/languages")
	public String index(Model model,@ModelAttribute("language") Language language) {
		model.addAttribute("languages", languageService.allLanguages());
		return "languages/languages.jsp";
	}
	
	@RequestMapping(value = "/languages", method = RequestMethod.POST)
	public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "languages/languages.jsp";
        } else {
            languageService.createLanguage(language);
            return "redirect:/languages";
        }
	}
	
    @RequestMapping("/languages/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Language  language= languageService.findLanguage(id);
        model.addAttribute("language", language);
        return "/languages/show.jsp";
    }
    
    @RequestMapping(value = "/languages/{id}/edit")
	public String edit(@PathVariable("id") Long id,Model model) {
		Language language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "/languages/edit.jsp";
	}
    
    @RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "/languages/edit.jsp";
        } else {
            languageService.createLanguage(language);
            return "redirect:/languages";
        }
    }
        
        @RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
        public String destroy(@PathVariable("id") Long id) {
            languageService.deleteLanguage(id);
            return "redirect:/languages";
        }
    }
	
	


