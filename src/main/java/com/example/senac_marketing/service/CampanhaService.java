package com.example.senac_marketing.service;

import com.example.senac_marketing.modal.Campanha;
import com.example.senac_marketing.repository.CampanhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CampanhaService {
    @Autowired
    private CampanhaRepository repository;



    public Campanha salvar(Campanha entity) throws Exception{

        return repository.save(entity);
    }

    public List<Campanha> buscaTodos() {
        return repository.findAll();
    }

    // adicionar metodo filter
//    public Page<Campanha> buscaTodos(String filter, Pageable pageable) {
//        return repository.findAll(filter, Campanha.class, pageable);
//    }

    public Campanha buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public  Campanha alterar(Long id, Campanha alterado){
        Optional<Campanha> encontrado = repository.findById(id);
        if (encontrado.isPresent()) {
            Campanha campanha = encontrado.get();
            campanha.setNome(alterado.getNome());
            campanha.setPeriodoInicio(alterado.getPeriodoInicio());
            campanha.setPeriodoFim(alterado.getPeriodoFim());
            campanha.setDescricao(alterado.getDescricao());
            campanha.setConteudo(alterado.getConteudo());
            campanha.setValor(alterado.getValor());

            return repository.save(campanha);
        }
        return null;
    }

    public void remover(Long id){
        repository.deleteById(id);
    }
}
