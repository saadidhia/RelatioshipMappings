package com.example.projetProduct.Refreshing.my.knowledge.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.projetProduct.Refreshing.my.knowledge.Model.Product;

@Repository
public interface ProductRepository extends  CrudRepository<Product, String> {
	
	
	List<Product> findAll();
	
	Product findByName(String name);
	
	
	
}
