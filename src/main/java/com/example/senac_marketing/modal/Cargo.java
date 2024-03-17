package com.example.senac_marketing.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Cargo extends EntiyId{

    @Column(name = "descricao", nullable = false)
    private String descricao;
    @Column(name = "nivel", nullable = false)
    private String nivel;
    @Column(name = "comissionado", nullable = false)
    private Boolean comissionado;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Boolean getComissionado() {
        return comissionado;
    }

    public void setComissionado(Boolean comissionado) {
        this.comissionado = comissionado;
    }

    @Override
    public String toString() {
        return "cargo{" +
                "descricao='" + descricao + '\'' +
                ", nivel='" + nivel + '\'' +
                ", comissionado=" + comissionado +
                '}';
    }
}
