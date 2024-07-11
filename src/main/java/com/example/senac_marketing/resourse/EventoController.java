package com.example.senac_marketing.resourse;

import com.example.senac_marketing.modal.Campanha;
import com.example.senac_marketing.modal.Evento;
import com.example.senac_marketing.resourse.representation.CampanhaDTO;
import com.example.senac_marketing.resourse.representation.EventoDTO;
import com.example.senac_marketing.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/eventos")
public class EventoController extends AbstractController{

    @Autowired
    private EventoService serviceEvento;


    @PostMapping
    public ResponseEntity create(@RequestBody Evento entity){
        Evento save = serviceEvento.salvar(entity);
        return ResponseEntity.created(URI.create("/api/eventos/" + entity.getId())).body(save);
    }

    @GetMapping
    public ResponseEntity findAll(@RequestParam(required = false) String filter,
                                  @RequestParam(defaultValue = "0") int page,
                                  @RequestParam(defaultValue = "10") int size) {
        Page<Evento> eventos = serviceEvento.buscaTodos(filter, PageRequest.of(page, size));
        Page<EventoDTO> eventoDTOs = EventoDTO.fromEntity(eventos);
        return ResponseEntity.ok(eventoDTOs);
    }


    @GetMapping("/{id}")
    public  ResponseEntity findById(@PathVariable("id") Long id){
        Evento evento = serviceEvento.buscaPorId(id);
        return ResponseEntity.ok().body(evento);
    }
    @DeleteMapping("/{id}")
    public  ResponseEntity remove(@PathVariable("id") Long id){
        serviceEvento.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public  ResponseEntity update(@PathVariable("id") Long id, @RequestBody Evento entity){
        Evento alterado = serviceEvento.alterar(id, entity);
        return  ResponseEntity.ok().body(alterado);
    }
}
