package com.example.projetProduct.Refreshing.my.knowledge.Sercice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.projetProduct.Refreshing.my.knowledge.Model.Product;

import com.example.projetProduct.Refreshing.my.knowledge.Repository.ProductRepository;

@Service
public class ProductService {
	
	
	@Autowired 
	private ProductRepository productRepository;
	public List<Product> getProducts(){
		
		return productRepository.findAll();
	}

	
	public Product FindProductService( String name) {
		return productRepository.findByName(name);
		
	}
	
	public Product add(Product p) {
		return productRepository.save(p);
		
	}
	
	
}
