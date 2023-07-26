package com.example.springdatajpa.repository;

import com.example.springdatajpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByFirstName(String firstName);
}
