package com.example.projetProduct.Refreshing.my.knowledge.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Person {
	
	@Id
	private int id;
	private String FirstName;
	private String LastName;
	
	private  String Email;
	
	@ManyToOne
	private Location location;
	
	@OneToMany(mappedBy="person")

	private List<Post> post;

	
	public Person() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@JsonIgnore
	public List<Post> getPost() {
		return post;
	}

	
    @JsonIgnore
	public void setPost(List<Post> post) {
		this.post = post;
	}

	public Person(int id, String firstName, String lastName, String email, List<Post> post) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		
		this.post = post;
	}
	
	
	

}
