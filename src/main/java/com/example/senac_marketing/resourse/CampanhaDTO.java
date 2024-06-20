package com.example.senac_marketing.resourse;

import com.example.senac_marketing.modal.Campanha;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CampanhaDTO extends AbstractController{

    private Long id;

    private String nome;

    private LocalDate periodoInicio;

    private LocalDate periodoFim;

    private String descricao;

    private String conteudo;

    private Double valor;

    public CampanhaDTO(Long id, String nome, LocalDate periodoInicio, LocalDate periodoFim,
                       String descricao, String conteudo, Double valor) {
        this.id = id;
        this.nome = nome;
        this.periodoInicio = periodoInicio;
        this.periodoFim = periodoFim;
        this.descricao = descricao;
        this.conteudo = conteudo;
        this.valor = valor;
    }


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

    public static CampanhaDTO fromEntity(Campanha campanha){
        return  new CampanhaDTO(
                campanha.getId(),
                campanha.getNome(),
                campanha.getPeriodoInicio(),
                campanha.getPeriodoFim(),
                campanha.getDescricao(),
                campanha.getConteudo(),
                campanha.getValor()
        );
    }

    public static List<CampanhaDTO> fromEntityList(List<Campanha> campanhas){
        List<CampanhaDTO> campanhaDTOList = new ArrayList<>();
        for (Campanha campanha : campanhas){
            campanhaDTOList.add(fromEntity(campanha));
        }
        return campanhaDTOList;
    }

    public Campanha toEntity(){
        Campanha campanha = new Campanha();
        campanha.setId(this.id);
        campanha.setNome(this.nome);
        campanha.setConteudo(this.conteudo);
        campanha.setDescricao(this.descricao);
        campanha.setValor(this.valor);
        campanha.setPeriodoInicio(this.periodoInicio);
        campanha.setPeriodoFim(this.periodoFim);
        return campanha;
    }

    public static List<Campanha> toEntityList(List<CampanhaDTO> campanhaDTOs){
        List<Campanha> campanhas = new ArrayList<>();
        for (CampanhaDTO campanhaDTO : campanhaDTOs){
            campanhas.add(campanhaDTO.toEntity());
        }
        return campanhas;
    }



}
