package com.castelo.dispenca.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.castelo.dispenca.dto.AlimentoDTO;
import com.castelo.dispenca.modelo.Alimento;
import com.castelo.dispenca.repository.AlimentoRepository;

@RequestMapping("/alimento")
public class AlimentoController {

    @Autowired
    private AlimentoRepository alimentoRepository;
    

    @GetMapping(value = "/findAll")
    public List findALL(){
        return alimentoRepository.findAll();
    }
    
    @PostMapping(value = "/insert")
    public ResponseEntity<Alimento> insert(@RequestBody AlimentoDTO alimentoDTO){

        Alimento alimento = alimentoDTO.novoAlimento();
        alimentoRepository.save(alimento);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(alimento.getId())
            .toUri();

        return ResponseEntity.created(uri).body(alimento);

    }

}