package com.example.senac_marketing.service;

import com.example.senac_marketing.modal.Funcionario;
import com.example.senac_marketing.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repositoryfuncionario;

    public Funcionario salvar(Funcionario entity) {
        return repositoryfuncionario.save(entity);
    }

    public List<Funcionario> buscaTodos() {
        return repositoryfuncionario.findAll();
    }

    public Funcionario buscaPorId(Long id) {
        return repositoryfuncionario.findById(id).orElse(null);
    }

    public Funcionario alterar(Long id, Funcionario alterado) {
        Optional<Funcionario> encontrado = repositoryfuncionario.findById(id);
        if (encontrado.isPresent()) {
            Funcionario funcionario = encontrado.get();
//            funcionario.setNome(alterado.getNome());




            return repositoryfuncionario.save(funcionario);
        }
        return null;
    }

    public void remover(Long id) {
        repositoryfuncionario.deleteById(id);


    }


}
