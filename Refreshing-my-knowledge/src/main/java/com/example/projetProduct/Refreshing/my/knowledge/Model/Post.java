package com.example.projetProduct.Refreshing.my.knowledge.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {

	@Id
	private int id;
	private LocalDate Date;
	private String  details;
	
	@ManyToOne
	private Person person;

	
	public Post() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Post(int id, LocalDate date, String details, Person person) {
		super();
		this.id = id;
		Date = date;
		this.details = details;
		this.person = person;
	}
	
	
}
