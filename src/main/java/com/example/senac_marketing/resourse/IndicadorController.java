package com.example.senac_marketing.resourse;

import com.example.senac_marketing.modal.Evento;
import com.example.senac_marketing.modal.Indicador;
import com.example.senac_marketing.resourse.representation.EventoDTO;
import com.example.senac_marketing.resourse.representation.IndicadorDTO;
import com.example.senac_marketing.service.IndicadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/indicadores")
public class IndicadorController extends AbstractController{
    @Autowired

    private IndicadorService ServiceIndicador;

    @PostMapping
    public ResponseEntity create(@RequestBody Indicador entity){
        Indicador save = ServiceIndicador.salvar(entity);
        return ResponseEntity.created(URI.create("/api/indicadores/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll(@RequestParam(required = false) String filter,
                                  @RequestParam(defaultValue = "0") int page,
                                  @RequestParam(defaultValue = "10") int size) {
        Page<Indicador> indicadores = ServiceIndicador.buscaTodos(filter, PageRequest.of(page, size));
        Page<IndicadorDTO> indicadorDTOs = IndicadorDTO.fromEntity(indicadores);
        return ResponseEntity.ok(indicadorDTOs);
    }
    @GetMapping("/{id}")
    public  ResponseEntity findById(@PathVariable("id") Long id){
        Indicador indicador = ServiceIndicador.buscaPorId(id);
        return ResponseEntity.ok().body(indicador);
    }
    @DeleteMapping("/{id}")
    public  ResponseEntity remove(@PathVariable("id") Long id){
        ServiceIndicador.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public  ResponseEntity update(@PathVariable("id") Long id, @RequestBody Indicador entity){
        Indicador alterado = ServiceIndicador.alterar(id, entity);
        return  ResponseEntity.ok().body(alterado);
    }

}
