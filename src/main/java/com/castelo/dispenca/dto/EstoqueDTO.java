package com.castelo.dispenca.dto;

import java.time.LocalDate;

import com.castelo.dispenca.modelo.Alimento;
import com.castelo.dispenca.modelo.Estoque;

public class EstoqueDTO {

    private int id;
    private Alimento alimento;
    private int quantidade;
    private String codigo;
    private LocalDate data;
    
    public EstoqueDTO() {
    }

    public EstoqueDTO(int id, Alimento alimento, int quantidade, String codigo, LocalDate data) {
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Estoque novoEstoque(){

        return new Estoque(null, alimento, quantidade, codigo, data);

    }
 
}
