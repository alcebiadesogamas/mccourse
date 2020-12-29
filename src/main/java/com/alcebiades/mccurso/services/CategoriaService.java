package com.alcebiades.mccurso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alcebiades.mccurso.domain.Categoria;
import com.alcebiades.mccurso.repositories.CategoriaRepository;

@Service //define que esta classe é uma service
public class CategoriaService {
	
	@Autowired //essa anotação instancia automaticamente o objeto cr do tipo categoriaRepository
	private CategoriaRepository cr;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = cr.findById(id);
		return obj.orElse(null);
	}
}
