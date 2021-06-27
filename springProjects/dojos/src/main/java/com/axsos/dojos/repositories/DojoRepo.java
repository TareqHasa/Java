package com.axsos.dojos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.dojos.models.Dojo;
@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long> {

}
