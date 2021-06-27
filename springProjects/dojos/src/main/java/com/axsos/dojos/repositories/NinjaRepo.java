package com.axsos.dojos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.dojos.models.Ninja;
@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long> {

}
