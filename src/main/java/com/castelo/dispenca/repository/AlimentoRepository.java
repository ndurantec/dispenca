package com.castelo.dispenca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.castelo.dispenca.modelo.Alimento;

public interface AlimentoRepository extends JpaRepository<Alimento, Long> {
    
    List<Alimento> findByNome(String nome);


}


