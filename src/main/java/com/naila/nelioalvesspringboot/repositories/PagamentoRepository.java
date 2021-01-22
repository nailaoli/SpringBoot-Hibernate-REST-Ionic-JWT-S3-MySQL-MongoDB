package com.naila.nelioalvesspringboot.repositories;

import com.naila.nelioalvesspringboot.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
