package com.example.senac_marketing.service;

import com.example.senac_marketing.modal.Campanha;
import com.example.senac_marketing.modal.Evento;
import com.example.senac_marketing.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {
    @Autowired
    private EventoRepository repository;

    public Evento salvar(Evento entity) {
        return repository.save(entity);
    }

    public List<Evento> buscaTodos() {
        return repository.findAll();
    }

    // adicionar metodo filter
    public Page<Evento> buscaTodos(String filter, Pageable pageable) {
        return repository.findAll(filter, Evento.class, pageable);
    }

    public Evento buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Evento alterar(Long id, Evento alterado) {
        Optional<Evento> encontrado = repository.findById(id);
        if (encontrado.isPresent()) {
            Evento evento = encontrado.get();
            evento.setNome(alterado.getNome());
            evento.setValor(alterado.getValor());
            evento.setDescricao(alterado.getDescricao());
            evento.setConteudo(alterado.getConteudo());
            evento.setPeriodoInicio(alterado.getPeriodoInicio());
            evento.setPeriodoFim(alterado.getPeriodoFim());
            evento.setLocal(alterado.getLocal());
            evento.setCusto(alterado.getCusto());
            return repository.save(evento);
        }
        return null;
    }

    public void remover(Long id) {
        repository.deleteById(id);


    }
}
