package com.castelo.dispenca.modelo;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estoque implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Alimento alimento;
    private int quantidade;
    private String codigo;
    private LocalDate data;

    public Estoque() {
    }

    public Estoque(Long id, Alimento alimento, int quantidade, String codigo, LocalDate data) {
        this.id = id;
        this.alimento = alimento;
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.data = data;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((alimento == null) ? 0 : alimento.hashCode());
        result = prime * result + quantidade;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
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
        Estoque other = (Estoque) obj;
        if (alimento == null) {
            if (other.alimento != null)
                return false;
        } else if (!alimento.equals(other.alimento))
            return false;
        if (quantidade != other.quantidade)
            return false;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Estoque [alimento=" + alimento + ", quantidade=" + quantidade + ", codigo=" + codigo + ", data=" + data
                + "]";
    }  
   
}
