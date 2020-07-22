package com.SpringRestProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRestProject.model.Person;
import com.SpringRestProject.services.PersonServices;

/*Initialized and exposes http verbs to client AKA postman*/
@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonServices services;
	
	//@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
	@GetMapping
	public List<Person> findAll() 
	{	
		return services.findAll();
	}
	
	//@RequestMapping(value= "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
	@GetMapping("/{id}")
	public Person findById(@PathVariable("id") Long id)
	{	
		return services.findById(id);
	}	

	//@RequestMapping(method = RequestMethod.POST, 
	//				consumes = MediaType.APPLICATION_JSON_VALUE,
	//				produces = MediaType.APPLICATION_JSON_VALUE )
	@PostMapping
	public Person findById(@RequestBody Person person) 
	{
		return services.create(person);
	}
	
	//@RequestMapping(method = RequestMethod.PUT, 
	//		consumes = MediaType.APPLICATION_JSON_VALUE,
	//		produces = MediaType.APPLICATION_JSON_VALUE )
	@PutMapping
	public Person update(@RequestBody Person person) 
	{
		return services.update(person);
	}	
	
	//@RequestMapping(value= "/{id}", 
	//				method = RequestMethod.DELETE, 
	//				produces = MediaType.APPLICATION_JSON_VALUE )
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) 
	{
		services.delete(id);
	}
	/*same as above but does not work
	 @DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) 
	{
		return ResponseEntity.ok().build();
	}	
	*/
}

