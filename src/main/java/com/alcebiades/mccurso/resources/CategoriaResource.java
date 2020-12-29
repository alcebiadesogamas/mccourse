package com.alcebiades.mccurso.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alcebiades.mccurso.domain.Categoria;
import com.alcebiades.mccurso.services.CategoriaService;


@RestController //controlador rest
@RequestMapping(value="/categorias") //endpoint ou seja a classe responde ao mesmo.
public class CategoriaResource {
	
	@Autowired
	private CategoriaService cs;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)//usei get pois estou obtendo um dado.
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria cat1 = new Categoria(1,"Informática");
		Categoria cat2 = new Categoria(2,"Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		return lista;
	}
}
