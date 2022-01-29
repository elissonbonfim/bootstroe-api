package com.elisson.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elisson.bookstore.repository.LivroRepository;
import com.elisson.bookstore.domain.Livro;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	
	public List<Livro> findAll() {
		return livroRepository.findAll();
	}

}
