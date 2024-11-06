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
import com.castelo.dispenca.dto.EstoqueDTO;
import com.castelo.dispenca.modelo.Alimento;
import com.castelo.dispenca.modelo.Estoque;
import com.castelo.dispenca.repository.EstoqueRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/estoque")
public class EstoqueController {

    @Autowired
    private EstoqueRepository estoqueRepository;

    /*
     * @GetMapping(value = "/findAll")
     * public List findAll(){
     * return alimentoRepository.findAll();
     * }
     */

    // 1 ok

    @GetMapping(value = "/findAll")

    public List findAll() {
        return estoqueRepository.findAll();

    }

    /*
     * @PostMapping(value = "/insert")
     * public ResponseEntity<Alimento> insert(@RequestBody AlimentoDTO alimentoDTO)
     * {
     * System.out.println(alimentoDTO.toString());
     * Alimento alimento = alimentoDTO.novoAlimento();
     * alimentoRepository.save(alimento);
     * System.out.println("chegou no insert");
     * URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
     * .path("/{id}")
     * .buildAndExpand(alimento.getId())
     * .toUri();
     * return ResponseEntity.created(uri).body(alimento);
     * }
     */

    // 2 ok

    @PostMapping(value = "/insert")
    public ResponseEntity<Estoque> insert(@RequestBody EstoqueDTO estoqueDTO) {

        System.out.println(estoqueDTO.toString());

        Estoque estoque = estoqueDTO.novoEstoque();

        estoqueRepository.save(estoque);

        System.out.println("chegou o insert");

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(estoque.getId())
                .toUri();

        return ResponseEntity.created(uri).body(estoque);

    }

    /*
     * @GetMapping(value = "/{id}")
     * public ResponseEntity<Alimento> findById(@PathVariable Long id){
     * return alimentoRepository.findById(id)
     * .map(registro -> ResponseEntity.ok().body(registro))
     * .orElse(ResponseEntity.notFound().build());
     */

    // 3 ok


    @GetMapping(value = "/{id}")
    public ResponseEntity<Estoque> findById(@PathVariable Long id) {

        return estoqueRepository.findById(id)

                .map(registro -> ResponseEntity.ok().body(registro))

                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(value = "/findByCodigo")
    public String findByCodigo(@RequestBody EstoqueDTO estoqueDTO){
        return estoqueRepository.findByCodigo(estoqueDTO.getCodigo());
    }


    //@PostMapping(value = "/findByNome")
    //public String buscarPorNome(@RequestBody AlimentoDTO alimentoDTO) {
    //    return alimentoRepository.findByNome(alimentoDTO.getNome());
    //}


    /*
     * @PutMapping(value = "/{id}")
     * public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody
     * Alimento alimento){
     * Optional<Alimento> alimentoBanco = alimentoRepository.findById(id);
     * Alimento alimentoModificado = alimentoBanco.get();
     * alimentoModificado.setNome(alimento.getNome());
     * alimentoRepository.save(alimentoModificado);
     * return ResponseEntity.noContent().build();
     */

    // 4 ok

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> atualizarEstoque(@PathVariable Long id, @RequestBody Estoque estoque) {

        Optional<Estoque> estoqueBanco = estoqueRepository.findById(id);

        Estoque estoqueModificado = estoqueBanco.get();

        estoqueModificado.setAlimento(estoque.getAlimento());

        estoqueModificado.setQuantidade(estoque.getQuantidade());

        estoqueModificado.setCodigo(estoque.getCodigo());

        estoqueModificado.setData(estoque.getData());

        estoqueRepository.save(estoqueModificado);

        return ResponseEntity.noContent().build();
    }

    /*
     * @DeleteMapping(value = "/{id}")
     * public ResponseEntity<Void> deletar(@PathVariable Long id){
     * alimentoRepository.deleteById(id);
     * return ResponseEntity.noContent().build();
     * }
     */

    // 5 ok

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletarEstoque(@PathVariable Long id) {

        estoqueRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

}
