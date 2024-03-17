package com.example.senac_marketing.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Pesquisa extends EntiyId{
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "periodoInicio",nullable = false)
    private LocalDate periodoInicio;
    @Column(name = "periodoFim",nullable = false)
    private LocalDate periodoFim;
    @Column(name = "setor",nullable = false)
    private String setor;
    @Column(name = "descricao",nullable = false)
    private String descricao;

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

    @Override
    public String toString() {
        return "Pesquisa{" +
                "nome='" + nome + '\'' +
                ", periodoInicio=" + periodoInicio +
                ", periodoFim=" + periodoFim +
                ", setor='" + setor + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
