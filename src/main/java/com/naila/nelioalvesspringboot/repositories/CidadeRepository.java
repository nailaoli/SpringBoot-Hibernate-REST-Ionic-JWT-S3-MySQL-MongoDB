package com.naila.nelioalvesspringboot.repositories;

import com.naila.nelioalvesspringboot.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
