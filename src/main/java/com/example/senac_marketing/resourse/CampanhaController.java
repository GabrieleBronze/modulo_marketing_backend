package com.example.senac_marketing.resourse;

import com.example.senac_marketing.modal.Campanha;
import com.example.senac_marketing.modal.Evento;
import com.example.senac_marketing.modal.Pesquisa;
import com.example.senac_marketing.repository.CampanhaRepository;
import com.example.senac_marketing.resourse.representation.CampanhaDTO;
import com.example.senac_marketing.service.CampanhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/campanhas")
public class CampanhaController extends AbstractController {
    @Autowired
    private CampanhaService serviceCampanha;


    @PostMapping
    public ResponseEntity create(@RequestBody Campanha entity) throws Exception {
        Campanha save = serviceCampanha.salvar(entity);
        return ResponseEntity.created(URI.create("/api/campanhas/" + entity.getId())).body(save);
    }

//    @GetMapping
//    public  ResponseEntity findAll(){
//        List<Campanha> campanha = serviceCampanha.buscaTodos();
//        return ResponseEntity.ok(campanha);
//    }


//    filtro DTO
@GetMapping
public ResponseEntity findAll(@RequestParam(required = false) String filter,
                              @RequestParam(defaultValue = "0") int page,
                              @RequestParam(defaultValue = "10") int size) {
    Page<Campanha> campanhas = serviceCampanha.buscaTodos(filter, PageRequest.of(page, size));
    Page<CampanhaDTO> campanhaDTOS = CampanhaDTO.fromEntity(campanhas);
    return ResponseEntity.ok(campanhaDTOS);
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
