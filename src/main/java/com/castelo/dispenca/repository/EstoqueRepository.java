package com.castelo.dispenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.castelo.dispenca.modelo.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
    
}
