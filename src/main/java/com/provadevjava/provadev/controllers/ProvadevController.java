package com.provadevjava.provadev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.provadevjava.provadev.services.ProvadevService;

@RequestMapping("/api/valor")
@RestController

public class ProvadevController {
	
	public ProvadevController() {}
	
	@Autowired
	private ProvadevService provadev;
	
	@GetMapping
	public ResponseEntity<String> verificaParOuImpar(@RequestParam("valor") int valor) {
		String resposta = provadev.verificaParImpar(valor);
		return ResponseEntity.ok().body(resposta);
	}
}
