package com.example.senac_marketing.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.awt.*;
import java.time.LocalDate;
import java.util.List;
@Entity
public class Indicadores extends  EntiyId{

    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "descricao",nullable = false)
    private String descricao;
    @Column(name = "setor",nullable = false)
    private String setor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Indicadores{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", setor='" + setor + '\'' +
                '}';
    }
}
