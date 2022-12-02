package com.example.udemy.course.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.udemy.course.demo.entity.Cliente;
import com.example.udemy.course.demo.repository.ClienteRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin 
public class ServiceCliente {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping("/clientes")
	public List<Cliente> getClientes() {
		return clienteRepository.findAll();
	}
}
