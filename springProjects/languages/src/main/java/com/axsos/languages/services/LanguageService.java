package com.axsos.languages.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.languages.models.Language;
import com.axsos.languages.repositories.LanguageRepo;

@Service
public class LanguageService {
	
	private final LanguageRepo languageRepo;

	public LanguageService(LanguageRepo languageRepo) {
		this.languageRepo = languageRepo;
	}
	
	public List<Language> allLanguages(){
		return (List<Language>) languageRepo.findAll();
	}
	
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepo.findById(id);
		return optionalLanguage.get();
		
	}
	
	public Language createLanguage(Language language) {
		return languageRepo.save(language);
	}
	
	public void deleteLanguage(Long id) {
		Optional< Language> language=languageRepo.findById(id);
		if (language.isPresent()) {
			languageRepo.deleteById(id);
		}
		 
	}
	

}
