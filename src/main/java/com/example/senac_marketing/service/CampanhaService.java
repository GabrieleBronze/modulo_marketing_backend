package com.example.senac_marketing.service;

import com.example.senac_marketing.modal.Campanha;
import com.example.senac_marketing.repository.CampanhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CampanhaService {
    @Autowired
    private CampanhaRepository repositorycampanha;

    public Campanha salvar(Campanha entity) {return repositorycampanha.save(entity);}

    public List<Campanha> buscaTodos() {return repositorycampanha.findAll();}

    public Campanha buscaPorId(Long id) {
        return repositorycampanha.findById(id).orElse(null);
    }

    public  Campanha alterar(Long id, Campanha alterado){
        Optional<Campanha> encontrado = repositorycampanha.findById(id);
        if (encontrado.isPresent()) {
            Campanha campanha = encontrado.get();
            campanha.setNome(alterado.getNome());
            campanha.setPeriodoInicio(alterado.getPeriodoInicio());
            campanha.setPeriodoFim(alterado.getPeriodoFim());
            campanha.setDescricao(alterado.getDescricao());
            campanha.setConteudo(alterado.getConteudo());
            campanha.setValor(alterado.getValor());

            return repositorycampanha.save(campanha);
        }
        return null;
    }

    public void remover(Long id){
        repositorycampanha.deleteById(id);
    }
}
