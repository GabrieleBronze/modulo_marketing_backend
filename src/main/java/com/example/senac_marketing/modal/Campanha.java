package com.example.senac_marketing.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Campanha extends EntiyId{

    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "periodoInicio",nullable = false)
    private LocalDate periodoInicio;
    @Column(name = "periodoFim",nullable = false)
    private LocalDate periodoFim;
    @Column(name = "descricao",nullable = false)
    private String descricao;
    @Column(name = "conteudo",nullable = false)
    private String conteudo;
    @Column(name = "valor",nullable = false)
    private Double valor;



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


    @Override
    public String toString() {
        return "Campanha{" +
                "nome='" + nome + '\'' +
                ", periodoInicio=" + periodoInicio +
                ", periodoFim=" + periodoFim +
                ", descricao='" + descricao + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", valor=" + valor +
                '}';
    }
}
