package com.example.senac_marketing.resourse.representation;

import com.example.senac_marketing.modal.Pesquisa;
import com.example.senac_marketing.modal.Qualidade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class QualidadeDTO {

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

    public static QualidadeDTO fromEntity(Qualidade qualidade) {
        QualidadeDTO dto = new QualidadeDTO();
        dto.setNome(qualidade.getNome());
        dto.setPeriodoInicio(qualidade.getPeriodoInicio());
        dto.setPeriodoFim(qualidade.getPeriodoFim());
        dto.setSetor(qualidade.getSetor());
        dto.setDescricao(qualidade.getDescricao());

        return dto;
    }
    public Qualidade toEntity() {
        Qualidade qualidade = new Qualidade();
        qualidade.setNome(this.getNome());
        qualidade.setPeriodoFim(this.getPeriodoFim());
        qualidade.setPeriodoInicio(this.getPeriodoInicio());
        qualidade.setSetor(this.getSetor());
        qualidade.setDescricao(this.getDescricao());
        return qualidade;
    }
    public static List<QualidadeDTO> fromEntity(List<Qualidade> Qualidade) {
        return Qualidade.stream().map(QualidadeDTO::fromEntity).collect(Collectors.toList());
    }
    public static Page<QualidadeDTO> fromEntity(Page<Qualidade> Qualidade) {
        List<QualidadeDTO> clientesFind = Qualidade.stream().map(QualidadeDTO::fromEntity).collect(Collectors.toList());
        return new PageImpl<>(clientesFind, Qualidade.getPageable(), Qualidade.getTotalElements());
    }








}




