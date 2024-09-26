package com.castelo.dispenca.modelo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DetalhePedido implements Serializable{

    // private static final long serialVersionUID = 1;

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantidadeSolicitada;
    private double valor;
    private String statusEntrega;

    @Deprecated
    public DetalhePedido() {
    }

    public DetalhePedido(int quantidadeSolicitada, double valor, String statusEntrega) {
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

    @Override
    public String toString() {
        return "DetalhePedido [id=" + id + ", quantidadeSolicitada=" + quantidadeSolicitada + ", valor=" + valor
                + ", statusEntrega=" + statusEntrega + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + quantidadeSolicitada;
        long temp;
        temp = Double.doubleToLongBits(valor);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((statusEntrega == null) ? 0 : statusEntrega.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DetalhePedido other = (DetalhePedido) obj;
        if (quantidadeSolicitada != other.quantidadeSolicitada)
            return false;
        if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
            return false;
        if (statusEntrega == null) {
            if (other.statusEntrega != null)
                return false;
        } else if (!statusEntrega.equals(other.statusEntrega))
            return false;
        return true;
    }
   

}
