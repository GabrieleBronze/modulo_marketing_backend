package com.example.senac_marketing.resourse.representation;

import com.example.senac_marketing.modal.Evento;
import com.example.senac_marketing.modal.Pesquisa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class PesquisaDTO {

    private String nome;

    private LocalDate periodoInicio;

    private LocalDate periodoFim;

    private String setor;

    private String descricao;


    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getPeriodoInicio() {
        return periodoInicio;
    }

    public void setPeriodoInicio(LocalDate periodoInicio) {
        this.periodoInicio = periodoInicio;
    }

    public LocalDate getPeriodoFim() {
        return periodoFim;
    }

    public void setPeriodoFim(LocalDate periodoFim) {
        this.periodoFim = periodoFim;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Métodos de conversão

    public static PesquisaDTO fromEntity(Pesquisa pesquisa) {
        PesquisaDTO dto = new PesquisaDTO();
        dto.setNome(pesquisa.getNome());
        dto.setPeriodoInicio(pesquisa.getPeriodoInicio());
        dto.setPeriodoFim(pesquisa.getPeriodoFim());
        dto.setSetor(pesquisa.getSetor());
        dto.setDescricao(pesquisa.getDescricao());
        return dto;
    }
    public static List<PesquisaDTO> fromEntity(List<Pesquisa> Pesquisa) {
        return Pesquisa.stream().map(PesquisaDTO::fromEntity).collect(Collectors.toList());
    }
    public static Page<PesquisaDTO> fromEntity(Page<Pesquisa> Pesquisa) {
        List<PesquisaDTO> clientesFind = Pesquisa.stream().map(PesquisaDTO::fromEntity).collect(Collectors.toList());
        return new PageImpl<>(clientesFind, Pesquisa.getPageable(), Pesquisa.getTotalElements());
    }

}
