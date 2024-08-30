package com.castelo.dispenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.castelo.dispenca.modelo.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    
}
