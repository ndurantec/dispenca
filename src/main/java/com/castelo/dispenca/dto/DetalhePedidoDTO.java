package com.castelo.dispenca.dto;

import com.castelo.dispenca.modelo.DetalhePedido;

public class DetalhePedidoDTO {

    private int id;
    private int quantidadeSolicita;
    private double valor;
    private boolean statusentrega;

    public DetalhePedidoDTO() {
    }

    public DetalhePedidoDTO(int id, int quantidadeSolicita, double valor, boolean statusentrega) {
        this.id = id;
        this.quantidadeSolicita = quantidadeSolicita;
        this.valor = valor;
        this.statusentrega = statusentrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public DetalhePedido novDetalhePedido(){

        return new DetalhePedido(id, quantidadeSolicita, valor, statusentrega);

    }
    
}
