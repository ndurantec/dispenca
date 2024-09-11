package com.castelo.dispenca.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jersey.JerseyProperties.Servlet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.castelo.dispenca.dto.PedidoDTO;
import com.castelo.dispenca.modelo.Pedido;
import com.castelo.dispenca.repository.PedidoRepository;

@RestController
@RequestMapping (value = "/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    /* @GetMapping(value = "/findAll")
    public List findAll(){   
   return alimentoRepository.findAll();
    } */

    //findAll completo 
    @GetMapping(value = "/findAll")
    public List findAll(){
        return pedidoRepository.findAll();
    }

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
     return ResponseEntity.created(uri).body(alimento); */

     //insert completo
    @PostMapping(value = "/insert")
    public ResponseEntity<Pedido> insert(@RequestBody PedidoDTO pedidoDTO){

        System.out.println(pedidoDTO.toString());

        Pedido pedido = pedidoDTO.novoPedido();

        pedidoRepository.save(pedido);

        System.out.println("chegou no insert");

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(pedido.getId())
        .toUri();
        return ResponseEntity.created(uri).body(pedido);

     }
    
     /*  @GetMapping(value = "/{id}")
        public ResponseEntity<Alimento> findById(@PathVariable Long id){
        return alimentoRepository.findById(id)
         .map(registro -> ResponseEntity.ok().body(registro))
             .orElse(ResponseEntity.notFound().build());
          */

          //findById completo
    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> findById(@PathVariable Long id){
        return pedidoRepository.findById(id)
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

    //update completo
    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody Pedido pedido){

        Optional<Pedido> pedidoBanco = pedidoRepository.findById(null);

        Pedido pedidoModificado = pedidoBanco.get();

        pedidoModificado.setDataEntrega(pedido.getDataEntrega());

        pedidoModificado.setDataPedido(pedido.getDataPedido());

        pedidoModificado.setOrigem(pedido.getOrigem());

        pedidoRepository.save(pedidoModificado);

        return ResponseEntity.noContent().build();
    }

    //Se não tá vermelho é pq tá funcionando

}
