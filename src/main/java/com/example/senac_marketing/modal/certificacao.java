package com.example.senac_marketing.modal;

import java.time.LocalDate;

public class certificacao {
    private String nome;
    private LocalDate dataEmissao;
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
