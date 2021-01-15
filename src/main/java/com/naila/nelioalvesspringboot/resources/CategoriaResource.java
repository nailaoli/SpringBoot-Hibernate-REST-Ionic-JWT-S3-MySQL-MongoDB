package com.naila.nelioalvesspringboot.resources;

import com.naila.nelioalvesspringboot.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

    @RequestMapping(method=RequestMethod.GET)
    public List<Categoria> listar(){
        Categoria cat1 = new Categoria(1, "Informática");
        Categoria cat2 = new Categoria(2, "Escritório");
        return Arrays.asList(cat1, cat2);
    }
}
