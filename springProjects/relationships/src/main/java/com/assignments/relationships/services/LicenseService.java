package com.assignments.relationships.services;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.assignments.relationships.models.License;
import com.assignments.relationships.repositories.LicenseRepository;




@Service
public class LicenseService {

	private final LicenseRepository licenseRepository;
	 Random rnd = new Random();
	    int number = rnd.nextInt(999999);



	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}

	public List<License> allLicense() {
		return licenseRepository.findAll();
	}

	public License createLicense(License license) {
	
		 final AtomicLong value = new AtomicLong(1);
		 int x=(int) value.getAndIncrement();
		 String str = String.format("%05d",x );
		
		 license.setNumber(str);
		return licenseRepository.save(license);
	}
}
