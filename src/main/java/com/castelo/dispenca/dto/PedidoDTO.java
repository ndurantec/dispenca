package com.castelo.dispenca.dto;

import java.time.LocalDateTime;

import com.castelo.dispenca.modelo.Pedido;

public class PedidoDTO {

    private Long id;
    private String origem;
    private LocalDateTime dataPedido;
    private LocalDateTime dataEntrega;
    
    public PedidoDTO() {
    }

    public PedidoDTO(Long id, String origem, LocalDateTime dataPedido, LocalDateTime dataEntrega) {
        this.id = id;
        this.origem = origem;
        this.dataPedido = dataPedido;
        this.dataEntrega = dataEntrega;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    /*  Modelo de estrutura
    
    public Alimento novoAlimento() {
     return new Alimento(null, this.name)
 
 } */

     public Pedido novoPedido(){

        return new Pedido(id, origem, dataPedido, dataEntrega);

    } 
    
}
