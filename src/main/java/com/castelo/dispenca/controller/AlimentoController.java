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

import com.castelo.dispenca.dto.AlimentoDTO;
import com.castelo.dispenca.modelo.Alimento;
import com.castelo.dispenca.repository.AlimentoRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/alimento")
public class AlimentoController {

    @Autowired
    private AlimentoRepository alimentoRepository;

    @GetMapping(value = "/findAll")
    public List findAll() {
        return alimentoRepository.findAll();
    }

    @PostMapping(value = "/insert")
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

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Alimento> findById(@PathVariable Long id) {

        return alimentoRepository.findById(id)
                .map(registro -> ResponseEntity.ok().body(registro))
                .orElse(ResponseEntity.notFound().build());

    }

    @GetMapping(value = "/findByNome")
    public List<Alimento> buscarPorNome(@RequestBody AlimentoDTO alimentoDTO) {
        return alimentoRepository.findByNome(alimentoDTO.getNome());
   }

   /* @PostMapping("/findByNome")
    public ResponseEntity<Long> buscarContaPorNome(@RequestBody ContaDto contaDto) {
        Optional<Alimento> alimento = alimentoRepository.findByNome(alimentoDTO.getNome());
        Conta contaObjeto = conta.get();
        System.out.println(contaObjeto.toString());
        return conta.map(c -> ResponseEntity.ok(c.getId()))
                .orElse(ResponseEntity.notFound().build());
    } */




    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody Alimento alimento) {

        Optional<Alimento> alimentoBanco = alimentoRepository.findById(id);

        Alimento alimentoModificado = alimentoBanco.get();

        alimentoModificado.setNome(alimento.getNome());

        alimentoRepository.save(alimentoModificado);

        return ResponseEntity.noContent().build();

    }

    /*
     * @DeleteMapping("/{id}")
     * public ResponseEntity<Object> delete(@PathVariable Long id){
     * return alimentoRepository.findById(id)
     * .map(alimento -> { alimentoRepository.delete(alimento);
     * return ResponseEntity.noContent().build();})
     * .orElseGet(() -> ResponseEntity.notFound().build());
     * }
     */

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        alimentoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
