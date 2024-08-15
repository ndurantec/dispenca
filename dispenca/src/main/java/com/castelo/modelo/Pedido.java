package com.castelo.modelo;

import java.time.LocalDateTime;

public class Pedido {
    
    private int id;
    private String origem;
    private LocalDateTime dataPedido;
    private LocalDateTime dataEntrega;
    
    public Pedido() {
    }

    public Pedido(int id, String origem, LocalDateTime dataPedido, LocalDateTime dataEntrega) {
        this.id = id;
        this.origem = origem;
        this.dataPedido = dataPedido;
        this.dataEntrega = dataEntrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((origem == null) ? 0 : origem.hashCode());
        result = prime * result + ((dataPedido == null) ? 0 : dataPedido.hashCode());
        result = prime * result + ((dataEntrega == null) ? 0 : dataEntrega.hashCode());
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
        Pedido other = (Pedido) obj;
        if (origem == null) {
            if (other.origem != null)
                return false;
        } else if (!origem.equals(other.origem))
            return false;
        if (dataPedido == null) {
            if (other.dataPedido != null)
                return false;
        } else if (!dataPedido.equals(other.dataPedido))
            return false;
        if (dataEntrega == null) {
            if (other.dataEntrega != null)
                return false;
        } else if (!dataEntrega.equals(other.dataEntrega))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pedido [origem=" + origem + ", dataPedido=" + dataPedido + ", dataEntrega=" + dataEntrega + "]";
    }

}
