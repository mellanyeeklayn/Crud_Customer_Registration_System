package com.example.crud.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.crud.api.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
	

}
