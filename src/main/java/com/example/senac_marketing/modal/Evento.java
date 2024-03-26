package com.example.senac_marketing.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Evento extends EntiyId{
    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "local",nullable = false)
    private String local;
    @Column(name = "periodoInicio",nullable = false)
    private LocalDate periodoInicio;
    @Column(name = "periodoFim",nullable = false)
    private LocalDate periodoFim;
    @Column(name = "valor",nullable = false)
    private Float valor;
    @Column(name = "custo",nullable = false)
    private Float custo;
    @Column(name = "conteudo",nullable = false)
    private String conteudo;
    @Column(name = "descricao",nullable = false)
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
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

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Float getCusto() {
        return custo;
    }

    public void setCusto(Float custo) {
        this.custo = custo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", local='" + local + '\'' +
                ", periodoInicio=" + periodoInicio +
                ", periodoFim=" + periodoFim +
                ", valor=" + valor +
                ", custo=" + custo +
                ", conteudo='" + conteudo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
