package com.example.senac_marketing.resourse;

import com.example.senac_marketing.modal.Qualidade;
import com.example.senac_marketing.service.QualidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/qualidade")
public class QualidadeController {

    @Autowired
    private QualidadeService serviceQualidade;

    @PostMapping
    public ResponseEntity create(@RequestBody Qualidade entity){
        Qualidade save = serviceQualidade.salvar(entity);
        return ResponseEntity.created(URI.create("/api/qualidade" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll(){
        List<Qualidade> qualidades = serviceQualidade.buscaTodos();
        return ResponseEntity.ok(qualidades);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable("id") Long id){
        Qualidade qualidades = serviceQualidade.buscaPorId(id);
        return ResponseEntity.ok().body(qualidades);
    }

    @DeleteMapping("/{id")
    public  ResponseEntity remove(@PathVariable("id") Long id){
        serviceQualidade.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Qualidade entity){
        Qualidade alterado = serviceQualidade.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }

}
