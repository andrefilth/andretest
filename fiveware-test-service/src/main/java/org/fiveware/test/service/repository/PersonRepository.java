package org.fiveware.test.service.repository;

import java.util.List;

import org.fiveware.test.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
	
	List<Person> findByName(String name);
	
	List<Person> findByAgeGreaterThan(Integer age);
}