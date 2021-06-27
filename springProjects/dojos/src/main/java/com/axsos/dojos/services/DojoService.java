package com.axsos.dojos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.dojos.models.Dojo;
import com.axsos.dojos.repositories.DojoRepo;

@Service
public class DojoService {
	private final DojoRepo dojoRepo;

	public DojoService(DojoRepo dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	public List<Dojo> findAllDojo() {
		return (List<Dojo>) dojoRepo.findAll();
	}

	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	public Dojo getDojoById(Long id) {
		Optional<Dojo> optionalDojo=dojoRepo.findById(id);
		if (optionalDojo.isPresent()) {
			return optionalDojo.get();
		}
		return null;
	}
}