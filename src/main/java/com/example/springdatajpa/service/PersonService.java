package com.example.springdatajpa.service;

import com.example.springdatajpa.model.Person;
import com.example.springdatajpa.repository.PersonRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@Transactional
@Slf4j
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public void savePerson(Person person){
        log.info("Поступил запрос на сохранение сущности");
        personRepository.save(person);
    }
    public Person findByFirstName(String firstName){
        Person person = personRepository.findByFirstName(firstName);
        return person;
    }
}
