package com.castelo.dispenca.dto;

import com.castelo.dispenca.modelo.DetalhePedido;

public class DetalhePedidoDTO {

    private Long id;
    private int quantidadeSolicita;
    private double valor;
    private boolean statusentrega;

    public DetalhePedidoDTO() {
    }

    public DetalhePedidoDTO(Long id, int quantidadeSolicita, double valor, boolean statusentrega) {
        this.id = id;
        this.quantidadeSolicita = quantidadeSolicita;
        this.valor = valor;
        this.statusentrega = statusentrega;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidadeSolicita() {
        return quantidadeSolicita;
    }

    public void setQuantidadeSolicita(int quantidadeSolicita) {
        this.quantidadeSolicita = quantidadeSolicita;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isStatusentrega() {
        return statusentrega;
    }

    public void setStatusentrega(boolean statusentrega) {
        this.statusentrega = statusentrega;
    }

        /* Modelo de estrutura 
        
        public Alimento novoAlimento() {
     return new Alimento(null, this.name);
 
    } */

    public DetalhePedido novoDetalhePedido(){

        return new DetalhePedido(id, quantidadeSolicita, valor, statusentrega);

    }
    
}
