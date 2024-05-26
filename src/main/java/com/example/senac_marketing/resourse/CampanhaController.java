package com.example.senac_marketing.resourse;

import com.example.senac_marketing.modal.Campanha;
import com.example.senac_marketing.service.CampanhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/campanha")
public class CampanhaController {
    @Autowired
    private CampanhaService serviceCampanha;

    @PostMapping
    public ResponseEntity create(@RequestBody Campanha entity){
        Campanha save = serviceCampanha.salvar(entity);
        return ResponseEntity.created(URI.create("/api/campanha" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll(){
        List<Campanha> campanhas = serviceCampanha.buscaTodos();
        return ResponseEntity.ok(campanhas);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable("id") Long id){
        Campanha campanhas = serviceCampanha.buscaPorId(id);
        return ResponseEntity.ok().body(campanhas);
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity remove(@PathVariable("id") Long id){
        serviceCampanha.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Campanha entity){
        Campanha alterado = serviceCampanha.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
