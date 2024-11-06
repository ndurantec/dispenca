package com.castelo.dispenca.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.castelo.dispenca.dto.EstoqueDTO;
import com.castelo.dispenca.modelo.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
    
    @Query(value = "select o.id from estoque o where o.codigo = ?1;", nativeQuery = true)
    String findByCodigo(String estoque);
  
}
