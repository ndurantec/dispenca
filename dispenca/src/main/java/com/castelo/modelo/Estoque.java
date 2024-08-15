package com.castelo.modelo;

import java.time.LocalDateTime;

public class Estoque {

    private int id;
    private Alimento alimento;
    private int quantidade;
    private String codigo;
    private LocalDateTime data;
    
    public Estoque() {
    }

    public Estoque(int id, Alimento alimento, int quantidade, String codigo, LocalDateTime data) {
        this.id = id;
        this.alimento = alimento;
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
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
