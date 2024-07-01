package com.example.senac_marketing.service;

import com.example.senac_marketing.modal.Evento;
import com.example.senac_marketing.modal.Indicador;
import com.example.senac_marketing.repository.IndicadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;


@Service
public class IndicadorService {

    @Autowired
    private  IndicadorRepository repository;

    public Indicador salvar(Indicador entity) { return repository.save(entity);}

    public List<Indicador> buscaTodos() {
        return repository.findAll();
    }

    // adicionar metodo filter
//    public Page<Indicador> buscaTodos(String filter, Pageable pageable) {
//        return repository.findAll(filter, Indicador.class, pageable);
//    }


    public Indicador buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Indicador alterar(Long id, Indicador alterado) {
        Optional<Indicador> encontrado = repository.findById(id);
        if (encontrado.isPresent()) {
            Indicador indicador = encontrado.get();
            indicador.setNome(alterado.getNome());
            indicador.setDescricao(alterado.getDescricao());
            indicador.setSetor(alterado.getSetor());

            return repository.save(indicador);
        }

        return null;
    }

    public void remover(Long id) {
        repository.deleteById(id);

    }

}
