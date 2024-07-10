package com.example.senac_marketing.service;

import com.example.senac_marketing.modal.Pesquisa;
import com.example.senac_marketing.modal.Qualidade;
import com.example.senac_marketing.repository.QualidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Service
public class QualidadeService {
    @Autowired
    private QualidadeRepository repository;

    public Qualidade salvar(Qualidade entity) {
        if(entity.getPeriodoInicio().isBefore(LocalDate.now())){
            throw new IllegalArgumentException("A data de inico nao pode ser anterior a data atual");
        }
        if(!entity.getSetor().matches("^[\\p{L}\\s]+$")){
            throw new IllegalArgumentException("O nome do evento deve conter apenas letras.");
        }

        return repository.save(entity);}

    public List<Qualidade> buscaTodos() {return repository.findAll(); }

    // adicionar metodo filter
    public Page<Qualidade> buscaTodos(String filter, Pageable pageable) {
        return repository.findAll(filter, Qualidade.class, pageable);
    }

    public Qualidade buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Qualidade alterar(Long id, Qualidade alterado) {
        Optional<Qualidade> encontrado = repository.findById(id);
        if (encontrado.isPresent()) {
            Qualidade qualidade = encontrado.get();
            qualidade.setNome(alterado.getNome());
            qualidade.setPeriodoInicio(alterado.getPeriodoInicio());
            qualidade.setPeriodoFim(alterado.getPeriodoFim());
            qualidade.setSetor(alterado.getSetor());
            qualidade.setDescricao(alterado.getDescricao());

            return repository.save(qualidade);
        }
        return null;
    }

    public void remover(Long id){
        repository.deleteById(id);
    }
}
