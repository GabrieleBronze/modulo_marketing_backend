package com.example.senac_marketing.service;

import com.example.senac_marketing.modal.funcionario;
import com.example.senac_marketing.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repositoryfuncionario;

    public funcionario salvar(funcionario entity) {
        return repositoryfuncionario.save(entity);
    }

    public List<funcionario> buscaTodos() {
        return repositoryfuncionario.findAll();
    }

    public funcionario buscaPorId(Long id) {
        return repositoryfuncionario.findById(id).orElse(null);
    }

    public funcionario alterar(Long id, funcionario alterado) {
        Optional<funcionario> encontrado = repositoryfuncionario.findById(id);
        if (encontrado.isPresent()) {
            funcionario funcionario = encontrado.get();
            funcionario.setAtuacao(alterado.getAtuacao());
            funcionario.setCNH(alterado.getCNH());
            funcionario.setCargo(alterado.getCargo());
            funcionario.setCPF(alterado.getCPF());

            return repositoryfuncionario.save(funcionario);
        }
        return null;
    }

    public void remover(Long id) {
        repositoryfuncionario.deleteById(id);


    }


}
