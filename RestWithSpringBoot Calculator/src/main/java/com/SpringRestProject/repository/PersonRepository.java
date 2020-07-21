package com.SpringRestProject.repository;


import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringRestProject.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}