package com.example.senac_marketing.resourse;

import com.example.senac_marketing.modal.Indicador;
import com.example.senac_marketing.modal.Pesquisa;
import com.example.senac_marketing.resourse.representation.IndicadorDTO;
import com.example.senac_marketing.resourse.representation.PesquisaDTO;
import com.example.senac_marketing.service.PesquisaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/pesquisas")
public class PesquisaController extends AbstractController{

    @Autowired
    private PesquisaService ServicePesquisa;


    @PostMapping
    public ResponseEntity create(@RequestBody Pesquisa entity){
        Pesquisa save = ServicePesquisa.salvar(entity);
        return ResponseEntity.created(URI.create("/api/Pesquisas/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll(@RequestParam(required = false) String filter,
                                  @RequestParam(defaultValue = "0") int page,
                                  @RequestParam(defaultValue = "10") int size) {
        Page<Pesquisa> pesquisas = ServicePesquisa.buscaTodos(filter, PageRequest.of(page, size));
        Page<PesquisaDTO> pesquisaDTOs = PesquisaDTO.fromEntity(pesquisas);
        return ResponseEntity.ok(pesquisaDTOs);
    }
    @GetMapping("/{id}")
    public  ResponseEntity findById(@PathVariable("id") Long id){
        Pesquisa pesquisas = ServicePesquisa.buscaPorId(id);
        return ResponseEntity.ok().body(pesquisas);
    }
    @DeleteMapping("/{id}")
    public  ResponseEntity remove(@PathVariable("id") Long id){
        ServicePesquisa.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public  ResponseEntity update(@PathVariable("id") Long id, @RequestBody Pesquisa entity){
        Pesquisa alterado = ServicePesquisa.alterar(id, entity);
        return  ResponseEntity.ok().body(alterado);
    }
}
