package org.fiveware.test.service;

import javax.inject.Inject;

import org.fiveware.test.model.Person;
import org.fiveware.test.model.request.PersonRequest;
import org.fiveware.test.service.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	private static final Logger logger = LoggerFactory.getLogger(PersonService.class);

	@Inject
	private PersonRepository personRepository;

	public Person find(final int id) {

		return this.personRepository.findOne(id);
	}

	public void save(final PersonRequest personRequest) {

		final Person person = new Person(personRequest.getName(), personRequest.getAge(), personRequest.getSex());
		
		logger.info("{}", person);

		this.personRepository.save(person);
	}
}