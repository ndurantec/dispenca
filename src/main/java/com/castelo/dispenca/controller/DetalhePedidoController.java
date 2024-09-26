package com.castelo.dispenca.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.castelo.dispenca.dto.DetalhePedidoDTO;
import com.castelo.dispenca.modelo.DetalhePedido;
import com.castelo.dispenca.repository.DetalhePedidorepository;


@RestController
@CrossOrigin("*")
@RequestMapping(value = "/DetalhePedido")
public class DetalhePedidoController {

    @Autowired
    private DetalhePedidorepository detalhePedidorepository;

    /* @GetMapping(value = "/findAll")
    public List findAll(){   
    return alimentoRepository.findAll();
    } */

    // 1 ok

    @GetMapping(value = "/findAll")
    public List findAll(){
        return detalhePedidorepository.findAll();
    }
    
    // Que preguiça de fazer isso, misericórdiaaaaa

 /* @PostMapping(value = "/insert")
    public ResponseEntity<Alimento> insert(@RequestBody AlimentoDTO alimentoDTO) {
        System.out.println(alimentoDTO.toString());
        Alimento alimento = alimentoDTO.novoAlimento();
        alimentoRepository.save(alimento);
        System.out.println("chegou no insert");
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(alimento.getId())
            .toUri();
        return ResponseEntity.created(uri).body(alimento);
 } */

    // 2 ok

    @PostMapping(value = "/insert")
    public ResponseEntity<DetalhePedido> inserirDetalhe(@RequestBody DetalhePedidoDTO detalhePedidoDTO){


    
        System.out.println("==================================================");
        System.out.println("==================================================");
        System.out.println("==================================================");
        System.out.println("==================================================");
        System.out.println(detalhePedidoDTO.toString());
        DetalhePedido detalhePedido = detalhePedidoDTO.novoDetalhe();
        detalhePedidorepository.save(detalhePedido);
        System.out.println("chegou no insert");
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(detalhePedido.getId())
            .toUri();
        return ResponseEntity.created(uri).body(detalhePedido);

    }

     /*  @GetMapping(value = "/{id}")
        public ResponseEntity<Alimento> findById(@PathVariable Long id){
        return alimentoRepository.findById(id)
            .map(registro -> ResponseEntity.ok().body(registro))
            .orElse(ResponseEntity.notFound().build()); */

            // 3 ok

    @GetMapping(value = "/{id}")
    public ResponseEntity<DetalhePedido> findById(@PathVariable Long id){

        return detalhePedidorepository.findById(id)
            .map(registro -> ResponseEntity.ok().body(registro))
            .orElse(ResponseEntity.notFound().build());

    }

        /* @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody Alimento alimento){

    Optional<Alimento> alimentoBanco = alimentoRepository.findById(id);

    Alimento alimentoModificado = alimentoBanco.get();

    alimentoModificado.setNome(alimento.getNome());

    alimentoRepository.save(alimentoModificado);

    return ResponseEntity.noContent().build(); */

    // 4 ok

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> atualizarDetalhePedido(@PathVariable Long id, @RequestBody DetalhePedido detalhePedido){

        Optional<DetalhePedido> detalhePedidoBanco = detalhePedidorepository.findById(id);

        DetalhePedido detalhePedidoModificado = detalhePedidoBanco.get();

        detalhePedidoModificado.setQuantidadeSolicitada(detalhePedido.getQuantidadeSolicitada());

        detalhePedidoModificado.setValor(detalhePedido.getValor());

        detalhePedidorepository.save(detalhePedidoModificado);

        return ResponseEntity.noContent().build();

    }

    /* @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
    alimentoRepository.deleteById(id);
    return ResponseEntity.noContent().build();
    */

    // 5 ok

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletarDetalhePedido(@PathVariable Long id){

        detalhePedidorepository.deleteById(id);

        return ResponseEntity.noContent().build();

    }

}
