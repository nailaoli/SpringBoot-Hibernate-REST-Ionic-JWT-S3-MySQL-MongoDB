package com.naila.nelioalvesspringboot.resources;

import com.naila.nelioalvesspringboot.domain.Categoria;
import com.naila.nelioalvesspringboot.domain.Cliente;
import com.naila.nelioalvesspringboot.services.CategoriaService;
import com.naila.nelioalvesspringboot.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService service;

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<?> findById(@PathVariable Integer id){
        Cliente cliente = service.buscar(id);
        return ResponseEntity.ok().body(cliente);
    }



}
