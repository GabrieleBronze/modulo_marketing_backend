package com.example.senac_marketing.resourse.representation;

import com.example.senac_marketing.modal.Campanha;
import com.example.senac_marketing.resourse.AbstractController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class CampanhaDTO extends AbstractController {

// adicionando id pelo perfil da pamela para testar o front-end
    private Long id;
// teste
    private String nome;

    private LocalDate periodoInicio;

    private LocalDate periodoFim;

    private String descricao;

    private String conteudo;

    private Double valor;



    // Getters e Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    // Métodos de conversão
    public static CampanhaDTO fromEntity(Campanha campanha) {
        CampanhaDTO dto = new CampanhaDTO();
        dto.setId(campanha.getId());
        dto.setNome(campanha.getNome());
        dto.setPeriodoInicio(campanha.getPeriodoInicio());
        dto.setPeriodoFim(campanha.getPeriodoFim());
        dto.setDescricao(campanha.getDescricao());
        dto.setConteudo(campanha.getConteudo());
        dto.setValor(campanha.getValor());
        return dto;
    }

    public Campanha toEntity() {
        Campanha campanha = new Campanha();
        campanha.setId(this.getId());
        campanha.setNome(this.getNome());
        campanha.setPeriodoFim(this.getPeriodoFim());
        campanha.setPeriodoInicio(this.getPeriodoInicio());
        campanha.setDescricao(this.getDescricao());
        campanha.setConteudo(this.getConteudo());
        campanha.setValor(this.getValor());
        return campanha;
    }

    public static List<CampanhaDTO> fromEntity(List<Campanha> Campanha) {
        return Campanha.stream().map(CampanhaDTO::fromEntity).collect(Collectors.toList());
    }

    public static Page<CampanhaDTO> fromEntity(Page<Campanha> Campanha) {
        List<CampanhaDTO> campanhas = Campanha.stream().map(CampanhaDTO::fromEntity).collect(Collectors.toList());
        return new PageImpl<>(campanhas, Campanha.getPageable(), Campanha.getTotalElements());
    }

}
