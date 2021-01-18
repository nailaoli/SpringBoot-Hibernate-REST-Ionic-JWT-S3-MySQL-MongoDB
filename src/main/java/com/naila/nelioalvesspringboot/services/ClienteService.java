package com.naila.nelioalvesspringboot.services;

import com.naila.nelioalvesspringboot.domain.Cliente;
import com.naila.nelioalvesspringboot.repositories.ClienteRepository;
import com.naila.nelioalvesspringboot.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente buscar(Integer id) {
        Optional<Cliente> optional = repo.findById(id);
        return optional.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }



}
