package com.example.senac_marketing.service;


import com.example.senac_marketing.modal.Pesquisa;
import com.example.senac_marketing.repository.PesquisaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PesquisaService {

    @Autowired
    private PesquisaRepository RepositoryPesquisa;

    public Pesquisa salvar(Pesquisa entity) {
        return RepositoryPesquisa.save(entity);
    }

    public List<Pesquisa> buscaTodos() {
        return RepositoryPesquisa.findAll();
    }

    public Pesquisa buscaPorId(Long id) {
        return RepositoryPesquisa.findById(id).orElse(null);
    }

    public Pesquisa alterar(Long id, Pesquisa alterado) {
        Optional<Pesquisa> encontrado = RepositoryPesquisa.findById(id);
        if (encontrado.isPresent()) {
            Pesquisa pesquisa = encontrado.get();
            pesquisa.setNome(alterado.getNome());
            pesquisa.setPeriodoInicio(alterado.getPeriodoInicio());
            pesquisa.setPeriodoFim(alterado.getPeriodoFim());
            pesquisa.setSetor(alterado.getSetor());
            pesquisa.setDescricao(alterado.getDescricao());
            return RepositoryPesquisa.save(pesquisa);
        }
        return null;
    }

    public void remover(Long id) {
        RepositoryPesquisa.deleteById(id);


    }


}
