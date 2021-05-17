package com.example.javadockeranddatabase.repository;

import com.example.javadockeranddatabase.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
