package com.example.projetProduct.Refreshing.my.knowledge.Controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetProduct.Refreshing.my.knowledge.Model.Person;
import com.example.projetProduct.Refreshing.my.knowledge.Repository.PersonRepository;
@RestController
public class PersonController {
	
	@Autowired
	private PersonRepository personRepo;
	
	
	@GetMapping("/dhia")
	public Collection<Person> FindDhia() {
		return personRepo.findDhia();
	}

}
