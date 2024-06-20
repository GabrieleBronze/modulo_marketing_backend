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
    private EventoRepository RepositoryEvento;

    public Evento salvar(Evento entity) {
        return RepositoryEvento.save(entity);
    }

    public List<Evento> buscaTodos() {
        return RepositoryEvento.findAll();
    }

    // adicionar metodo filter
    public Page<Evento> buscaTodos(String filter, Pageable pageable) {
        return RepositoryEvento.findAll(filter, Evento.class, pageable);
    }

    public Evento buscaPorId(Long id) {
        return RepositoryEvento.findById(id).orElse(null);
    }

    public Evento alterar(Long id, Evento alterado) {
        Optional<Evento> encontrado = RepositoryEvento.findById(id);
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
            return RepositoryEvento.save(evento);
        }
        return null;
    }

    public void remover(Long id) {
        RepositoryEvento.deleteById(id);


    }
}
