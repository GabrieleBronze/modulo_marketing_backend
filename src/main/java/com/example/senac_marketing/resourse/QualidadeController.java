package com.example.senac_marketing.resourse;

import com.example.senac_marketing.modal.Pesquisa;
import com.example.senac_marketing.modal.Qualidade;
import com.example.senac_marketing.resourse.representation.PesquisaDTO;
import com.example.senac_marketing.resourse.representation.QualidadeDTO;
import com.example.senac_marketing.service.QualidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/qualidades")
public class QualidadeController extends AbstractController{

    @Autowired
    private QualidadeService serviceQualidade;

    @PostMapping
    public ResponseEntity create(@RequestBody Qualidade entity){
        Qualidade save = serviceQualidade.salvar(entity);
        return ResponseEntity.created(URI.create("/api/qualidades" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll(@RequestParam(required = false) String filter,
                                  @RequestParam(defaultValue = "0") int page,
                                  @RequestParam(defaultValue = "10") int size) {
        Page<Qualidade> qualidades = serviceQualidade.buscaTodos(filter, PageRequest.of(page, size));
        Page<QualidadeDTO> qualidadeDTOS = QualidadeDTO.fromEntity(qualidades);
        return ResponseEntity.ok(qualidadeDTOS);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable("id") Long id){
        Qualidade qualidades = serviceQualidade.buscaPorId(id);
        return ResponseEntity.ok().body(qualidades);
    }

    @DeleteMapping("/{id}")
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
