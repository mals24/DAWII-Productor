package com.prestamo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prestamo.entity.Catalogo;
import com.prestamo.service.CatalogoService;

@RestController
@RequestMapping("/url/catalogo")
public class CatalogoController {
	
	@Autowired
    private CatalogoService catalogoService;

    
    @PostMapping("/inserta")
	public Catalogo insertaCatalogo(@RequestBody Catalogo catalogo) {
		return catalogoService.insertaCatalogo(catalogo);
	}

}
