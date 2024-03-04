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
            funcionario.setNome(alterado.getNome());
            funcionario.setDataNascimento(alterado.getDataNascimento());
            funcionario.setRG(alterado.getRG());
            funcionario.setCPF(alterado.getCPF());
            funcionario.setTituloEleitor(alterado.getTituloEleitor());
            funcionario.setCNH(alterado.getCNH());
            funcionario.setPIS(alterado.getPIS());
            funcionario.setCTPS(alterado.getCTPS());
            funcionario.setNacionalidade(alterado.getNacionalidade());
            funcionario.setRacaCor(alterado.getRacaCor());
            funcionario.setEndereco(alterado.getEndereco());
            funcionario.setTelefone(alterado.getTelefone());
            funcionario.setEmail(alterado.getEmail());
            funcionario.setRedeSocial(alterado.getRedeSocial());
            funcionario.setIdioma(alterado.getIdioma());
            funcionario.setReligiao(alterado.getReligiao());
            funcionario.setDoadorDeSangue(alterado.getDoadorDeSangue());
            funcionario.setCadastroReservista(alterado.getCadastroReservista());
            funcionario.setRegistroProficional(alterado.getRegistroProficional());
            funcionario.setMatricula(alterado.getMatricula());
            funcionario.setAtuacao(alterado.getAtuacao());
            funcionario.setSetor(alterado.getSetor());
            funcionario.setDataAdmissao(alterado.getDataAdmissao());
            funcionario.setSalario(alterado.getSalario());
            funcionario.setCargaHoraria(alterado.getCargaHoraria());
            funcionario.setHoraEntrada(alterado.getHoraEntrada());
            funcionario.setHoraSaida(alterado.getHoraSaida());
            funcionario.setHoraExtra(alterado.getHoraExtra());
            funcionario.setSindicato(alterado.getSindicato());



            return repositoryfuncionario.save(funcionario);
        }
        return null;
    }

    public void remover(Long id) {
        repositoryfuncionario.deleteById(id);


    }


}
