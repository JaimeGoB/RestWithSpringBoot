package com.SpringRestProject.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.SpringRestProject.model.Person;

//Spring to take care of dependency injection. We can just add auto
@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) 
	{
		
		Person person = new Person();
		
		person.setId(counter.incrementAndGet());
		person.setFirstName("Jaime");
		person.setLastName("R");
		person.setAddress("GP");
		person.setGender("Male");
		
		
		return person;
	}
	
	public List<Person> findAll()
	{
		
		List<Person> persons = new ArrayList <Person>();
		
		for(int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		
		
		return persons;
	}

	private Person mockPerson(int i) {
		
		
		Person person = new Person();
		
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name " + i );
		person.setLastName("LastName" + i );
		person.setAddress("Addgress" + i );
		person.setGender("Gender" + i );
		
		return person;
	}
}
