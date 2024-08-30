package com.castelo.dispenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.castelo.dispenca.modelo.DetalhePedido;

public interface DetalhePedidorepository extends JpaRepository<DetalhePedido, Long> {
    
}
