package com.naila.nelioalvesspringboot.services;

import com.naila.nelioalvesspringboot.domain.Categoria;
import com.naila.nelioalvesspringboot.repositories.CategoriaRepository;
import com.naila.nelioalvesspringboot.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) {
        Optional<Categoria> optional = repo.findById(id);
        return optional.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }



}
