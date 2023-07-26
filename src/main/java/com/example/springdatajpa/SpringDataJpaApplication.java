package com.example.springdatajpa;

import com.example.springdatajpa.model.Person;
import com.example.springdatajpa.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		PersonService personService = context.getBean(PersonService.class);
		Person person = Person.builder()
						.age(30)
						.firstName("Mark")
						.lastName("Mask")
						.build();
		personService.savePerson(person);
		log.info(personService.findByFirstName("Mark").toString());


	}

}
