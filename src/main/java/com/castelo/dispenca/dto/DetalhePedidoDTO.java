package com.castelo.dispenca.dto;

import com.castelo.dispenca.modelo.DetalhePedido;

public class DetalhePedidoDTO {

    private Long id;
    private int quantidadeSolicita;
    private double valor;
    private String statusentrega;

    public DetalhePedidoDTO() {
    }

    public DetalhePedidoDTO(Long id, int quantidadeSolicita, double valor, String statusentrega) {
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

    public String getStatusentrega() {
        return statusentrega;
    }

    public void setStatusentrega(String statusentrega) {
        this.statusentrega = statusentrega;
    }
    
    public DetalhePedido novoDetalhe(){

        return new DetalhePedido(quantidadeSolicita, valor, statusentrega);

    }

}
