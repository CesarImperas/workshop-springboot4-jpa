package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

@Service
public class ProductService {

	// Dependência
	@Autowired
	private ProductRepository repository;

	// Operação na camada de serviço, que repassa a chamada para a camada de repositórios
	public List<Product> findAll() {
		return repository.findAll();
	}

	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}







}
