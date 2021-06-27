package com.assignments.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.assignments.relationships.models.Person;
import com.assignments.relationships.repositories.PersonRepository;

@Service
public class PersonService {

	private final PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public List<Person> allPersonsUnList() {
		return personRepository.findByLicenseIdIsNull();
	}

	public Person createPerson(Person person) {
		return personRepository.save(person);
	}

	public Person findPerson(long id) {
		Optional<Person> optionalPerson = personRepository.findById(id);
		if (optionalPerson.isPresent()) {
			return optionalPerson.get();
		} else {
			return null;
		}
	}

}
