package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service
public class OrderService {

	// Dependência
	@Autowired
	private OrderRepository repository;

	// Operação na camada de serviço, que repassa a chamada para a camada de repositórios
	public List<Order> findAll() {
		return repository.findAll();
	}

	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}







}
