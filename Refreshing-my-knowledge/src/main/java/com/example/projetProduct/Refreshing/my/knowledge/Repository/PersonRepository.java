package com.example.projetProduct.Refreshing.my.knowledge.Repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.projetProduct.Refreshing.my.knowledge.Model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {
	
	
	@Query(value="SELECT * FROM Person p where p.first_name='dhia' ",nativeQuery = true)
	Collection<Person> findDhia();
	

}
