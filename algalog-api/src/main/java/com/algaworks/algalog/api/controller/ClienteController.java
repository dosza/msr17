package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	@GetMapping("/clientes")
	public List<Cliente> listar(){
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Joao");
		cliente1.setEmail("joaodascoves@algaworks.com");
		cliente1.setTelefone("34 9999-1111");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setEmail("mariadasilva@algaworks.com");
		cliente2.setTelefone("11 97777-2222");
		
		
		
		return Arrays.asList(cliente1,cliente2);
	}
}
	