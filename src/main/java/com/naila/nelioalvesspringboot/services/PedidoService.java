package com.naila.nelioalvesspringboot.services;

import com.naila.nelioalvesspringboot.domain.Pedido;
import com.naila.nelioalvesspringboot.repositories.PedidoRepository;
import com.naila.nelioalvesspringboot.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido buscar(Integer id) {
        Optional<Pedido> optional = repo.findById(id);
        return optional.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }



}
