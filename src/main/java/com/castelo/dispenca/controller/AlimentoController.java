package com.castelo.dispenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.castelo.dispenca.repository.AlimentoRepository;

@RequestMapping("/alimento")
public class AlimentoController {

    @Autowired
    private AlimentoRepository alimentoRepository;
    

    @GetMapping(value = "/findAll")
    public List findALL(){
        return alimentoRepository.findAll();
    }
    
}
