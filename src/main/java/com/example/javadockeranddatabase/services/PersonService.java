package com.example.javadockeranddatabase.services;

import com.example.javadockeranddatabase.entities.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Person save(Person person);

    Optional<Person> findById(Long id);

    List<Person> findAll();

}
