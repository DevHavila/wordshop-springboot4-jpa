package com.educandoweb.corse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.corse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
