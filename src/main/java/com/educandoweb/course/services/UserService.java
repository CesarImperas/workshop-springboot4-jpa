package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {

	// Dependência
	@Autowired
	private UserRepository repository;

	// Operação na camada de serviço, que repassa a chamada para a camada de repositórios
	public List<User> findAll() {
		return repository.findAll();
	}

	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}







}
