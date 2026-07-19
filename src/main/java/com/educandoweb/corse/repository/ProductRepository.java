package com.educandoweb.corse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.corse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

		
	
}
