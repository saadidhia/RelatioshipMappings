package com.example.projetProduct.Refreshing.my.knowledge.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private String name;
	private float price;
	private String quality;
	
	public Product () {
		
	}
	public Product(String name ,float d, String quality) {
		super();
		this.name = name;
		this.price = d;
		this.quality = quality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	
	
	

}
