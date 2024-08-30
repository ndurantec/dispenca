package com.castelo.dispenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.castelo.dispenca.modelo.Alimento;

public interface AlimentoRepository extends JpaRepository<Alimento, Long> {
    
}


