package com.castelo.dispenca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.castelo.dispenca.modelo.Alimento;

public interface AlimentoRepository extends JpaRepository<Alimento, Long> {
    
    @Query(value = "select id from alimento where nome = ?1", nativeQuery = true)
    String findByNome(String nome);

}


