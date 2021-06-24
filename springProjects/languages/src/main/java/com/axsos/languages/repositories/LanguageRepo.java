package com.axsos.languages.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.languages.models.Language;

@Repository
public interface LanguageRepo extends CrudRepository<Language, Long> {

}
