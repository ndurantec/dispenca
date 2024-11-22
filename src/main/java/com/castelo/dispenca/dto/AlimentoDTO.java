package com.castelo.dispenca.dto;

import com.castelo.dispenca.modelo.Alimento;

public class AlimentoDTO {

    private Long id;
    private String nome;
    
    public AlimentoDTO() {
    }

    public AlimentoDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Alimento novoAlimento(){

        return new Alimento(null, nome);

    }
    
   /*  Modelo de estrutura
   
   public Alimento novoAlimento() {

        return new Alimento(null, this.name);
    
    } */
}
