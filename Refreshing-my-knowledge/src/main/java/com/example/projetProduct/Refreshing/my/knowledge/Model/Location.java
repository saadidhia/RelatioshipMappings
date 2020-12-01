package com.example.projetProduct.Refreshing.my.knowledge.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Location {
	
	@Id
	private int id;
	private String Name;
	
	@OneToMany(mappedBy="location")
	
	private List<Person> person;
	
	
	public Location() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	
	@JsonIgnore
	public List<Person> getPerson() {
		return person;
	}


	@JsonIgnore
	public void setPerson(List<Person> person) {
		this.person = person;
	}

	public Location(int id, String name, List<Person> person) {
		super();
		this.id = id;
		Name = name;
		this.person = person;
	}
	
	
	

}
