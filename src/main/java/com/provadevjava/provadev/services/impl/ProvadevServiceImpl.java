package com.provadevjava.provadev.services.impl;

import org.springframework.stereotype.Service;

import com.provadevjava.provadev.services.ProvadevService;

@Service
public class ProvadevServiceImpl implements ProvadevService{

	@Override
	public String verificaParImpar(int valor) {
		if (valor%2 == 0){
			return "número é par"; 
		 }else{
			return "número é impar";
		 }
	}

}
