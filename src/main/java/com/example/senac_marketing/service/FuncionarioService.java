package com.example.senac_marketing.service;

import com.example.senac_marketing.modal.Evento;
import com.example.senac_marketing.modal.Funcionario;
import com.example.senac_marketing.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    // adicionar metodo filter
    public Page<Funcionario> buscaTodos(String filter, Pageable pageable) {
        return repositoryfuncionario.findAll(filter, Funcionario.class, pageable);
    }

    public Funcionario buscaPorId(Long id) {
        return repositoryfuncionario.findById(id).orElse(null);
    }

    public Funcionario alterar(Long id, Funcionario alterado) {
        Optional<Funcionario> encontrado = repositoryfuncionario.findById(id);
        if (encontrado.isPresent()) {
            Funcionario funcionario = encontrado.get();
            funcionario.setNome(alterado.getNome());
            funcionario.setCPF(alterado.getCPF());
            funcionario.setRG(alterado.getRG());
            funcionario.setEndereco(alterado.getEndereco());
            funcionario.setCTPS(alterado.getCTPS());
            funcionario.setSalario(alterado.getSalario());
            funcionario.setCargaHoraria(alterado.getCargaHoraria());
            funcionario.setTituloEleitor(alterado.getTituloEleitor());
            funcionario.setCadastroReservista(alterado.getCadastroReservista());
            funcionario.setDataNascimento(alterado.getDataNascimento());
            funcionario.setPIS(alterado.getPIS());
            funcionario.setRegistroProficional(alterado.getRegistroProficional());
            funcionario.setEmail(alterado.getEmail());
            funcionario.setSindicato(alterado.getSindicato());
            funcionario.setSetor(alterado.getSetor());
            funcionario.setCNH(alterado.getCNH());
            funcionario.setDataAdmissao(alterado.getDataAdmissao());
            funcionario.setRacaCor(alterado.getRacaCor());
            funcionario.setReligiao(alterado.getReligiao());
            funcionario.setDoadorDeSangue(alterado.getDoadorDeSangue());
            funcionario.setDataNascimento(alterado.getDataNascimento());
            funcionario.setRedeSocial(alterado.getRedeSocial());
            funcionario.setAtuacao(alterado.getAtuacao());
            funcionario.setMatricula(alterado.getMatricula());
            funcionario.setIdioma(alterado.getIdioma());
            funcionario.setHoraExtra(alterado.getHoraExtra());
            funcionario.setHoraSaida(alterado.getHoraSaida());
            funcionario.setHoraEntrada(alterado.getHoraEntrada());
            funcionario.setTelefone(alterado.getTelefone());
            funcionario.setCargo(funcionario.getCargo());
            funcionario.setCertificacao(alterado.getCertificacao());
            funcionario.setFiliacao(alterado.getFiliacao());
            funcionario.setExpAnterior(alterado.getExpAnterior());
            funcionario.setDependente(alterado.getDependente());
            funcionario.setDadoBancario(alterado.getDadoBancario());

            funcionario.setEscolaridade(alterado.getEscolaridade());
            funcionario.setEstadoCivil(alterado.getEstadoCivil());
            funcionario.setGenero(alterado.getGenero());
            funcionario.setModalidadeContratual(alterado.getModalidadeContratual());
            funcionario.setStatus(alterado.getStatus());
            funcionario.setTipoConta(alterado.getTipoConta());
            funcionario.setTipoSanguineo(alterado.getTipoSanguineo());
            funcionario.setTurno(alterado.getTurno());









            return repositoryfuncionario.save(funcionario);
        }
        return null;
    }

    public void remover(Long id) {
        repositoryfuncionario.deleteById(id);


    }


}
