package com.example.senac_marketing.service;


import com.example.senac_marketing.modal.Indicador;
import com.example.senac_marketing.modal.Pesquisa;
import com.example.senac_marketing.repository.PesquisaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PesquisaService {

    @Autowired
    private PesquisaRepository repository;

    public Pesquisa salvar(Pesquisa entity) {

        if(entity.getPeriodoInicio().isBefore(LocalDate.now())){
            throw new IllegalArgumentException("A data de inico nao pode ser anterior a data atual");
    }
        if(!entity.getSetor().matches("^[\\p{L}\\s]+$")){
            throw new IllegalArgumentException("O nome do evento deve conter apenas letras.");
        }

        return repository.save(entity);
    }

    public List<Pesquisa> buscaTodos() {
        return repository.findAll();
    }

    // adicionar metodo filter
    public Page<Pesquisa> buscaTodos(String filter, Pageable pageable) {
        return repository.findAll(filter, Pesquisa.class, pageable);
    }

    public Pesquisa buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Pesquisa alterar(Long id, Pesquisa alterado) {
        Optional<Pesquisa> encontrado = repository.findById(id);
        if (encontrado.isPresent()) {
            Pesquisa pesquisa = encontrado.get();
            pesquisa.setNome(alterado.getNome());
            pesquisa.setPeriodoInicio(alterado.getPeriodoInicio());
            pesquisa.setPeriodoFim(alterado.getPeriodoFim());
            pesquisa.setSetor(alterado.getSetor());
            pesquisa.setDescricao(alterado.getDescricao());
            return repository.save(pesquisa);
        }
        return null;
    }

    public void remover(Long id) {
        repository.deleteById(id);


    }


}
