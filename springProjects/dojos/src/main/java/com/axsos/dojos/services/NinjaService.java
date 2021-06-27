package com.axsos.dojos.services;

import org.springframework.stereotype.Service;

import com.axsos.dojos.models.Ninja;
import com.axsos.dojos.repositories.NinjaRepo;

@Service
public class NinjaService {
	public final NinjaRepo ninjaRepo;

	public NinjaService(NinjaRepo ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}

	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}

}
