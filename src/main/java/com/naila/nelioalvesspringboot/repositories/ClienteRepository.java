package com.naila.nelioalvesspringboot.repositories;

import com.naila.nelioalvesspringboot.domain.Cliente;
import com.naila.nelioalvesspringboot.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
