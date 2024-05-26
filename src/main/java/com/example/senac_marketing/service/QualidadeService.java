package com.example.senac_marketing.service;

import com.example.senac_marketing.modal.Qualidade;
import com.example.senac_marketing.repository.QualidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class QualidadeService {
    @Autowired
    private QualidadeRepository repositoryqualidade;

    public Qualidade salvar(Qualidade entity) {return repositoryqualidade.save(entity);}

    public List<Qualidade> buscaTodos() {return repositoryqualidade.findAll(); }

    public Qualidade buscaPorId(Long id) {
        return repositoryqualidade.findById(id).orElse(null);
    }

    public Qualidade alterar(Long id, Qualidade alterado) {
        Optional<Qualidade> encontrado = repositoryqualidade.findById(id);
        if (encontrado.isPresent()) {
            Qualidade qualidade = encontrado.get();
            qualidade.setNome(alterado.getNome());
            qualidade.setPeriodoInicio(alterado.getPeriodoInicio());
            qualidade.setPeriodoFim(alterado.getPeriodoFim());
            qualidade.setSetor(alterado.getSetor());
            qualidade.setDescricao(alterado.getDescricao());

            return repositoryqualidade.save(qualidade);
        }
        return null;
    }

    public void remover(Long id){
            repositoryqualidade.deleteById(id);
    }
}
