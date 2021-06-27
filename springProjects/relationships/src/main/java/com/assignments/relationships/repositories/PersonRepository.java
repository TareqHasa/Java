package com.assignments.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignments.relationships.models.Person;


@Repository

public interface PersonRepository extends CrudRepository<Person, Long>  {

	List<Person> findAll();
	List<Person> findByLicenseIdIsNull();
	
}
