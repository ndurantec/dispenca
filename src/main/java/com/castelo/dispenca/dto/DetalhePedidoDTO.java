package com.castelo.dispenca.dto;

import com.castelo.dispenca.modelo.DetalhePedido;

public class DetalhePedidoDTO {

    private Long id;
    private int quantidadeSolicitada;
    private double valor;
    private String statusEntrega;

    public DetalhePedidoDTO() {
    }

    public DetalhePedidoDTO(int quantidadeSolicitada, double valor, String statusEntrega) {
        this.quantidadeSolicitada = quantidadeSolicitada;
        this.valor = valor;
        this.statusEntrega = statusEntrega;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    public void setQuantidadeSolicitada(int quantidadeSolicitada) {
        this.quantidadeSolicitada = quantidadeSolicitada;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatusEntrega() {
        return statusEntrega;
    }

    public void setStatusEntrega(String statusEntrega) {
        this.statusEntrega = statusEntrega;
    }
  
    public DetalhePedido novoDetalhe() {
        System.out.println("**********************************");
        System.out.println("**********************************");
        System.out.println("**********************************");
        System.out.println(this.quantidadeSolicitada);
        System.out.println(this.valor);
        System.out.println(this.statusEntrega);
        
        return new DetalhePedido(this.quantidadeSolicitada, this.valor, this.statusEntrega);
    }

    @Override
    public String toString() {
        return "DetalhePedidoDTO [id=" + id + ", quantidadeSolicita=" + quantidadeSolicitada + ", valor=" + valor
                + ", statusEentrega=" + statusEntrega + "]";
    }

}