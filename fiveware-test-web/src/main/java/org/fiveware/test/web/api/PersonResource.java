package org.fiveware.test.web.api;

import javax.inject.Inject;

import org.fiveware.test.model.Person;
import org.fiveware.test.model.request.PersonRequest;
import org.fiveware.test.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonResource {

	private static final Logger logger = LoggerFactory.getLogger(PersonResource.class);

	@Inject
	private PersonService personService;

	@RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
	public Person getPerson(@PathVariable("id") Integer id) {
		return this.personService.find(id);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void save(@RequestBody PersonRequest request) {
		logger.info("Request: {}", request);
		this.personService.save(request);
	}
}