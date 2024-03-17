package com.example.senac_marketing.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.time.LocalDate;
@Entity
public class Certificacao extends EntiyId{
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "dataEmissao", nullable = false)
    private LocalDate dataEmissao;
    @Column(name = "cargaHoraria", nullable = false)
    private Double cargaHoraria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "certificacao{" +
                "nome='" + nome + '\'' +
                ", dataEmissao=" + dataEmissao +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
