package com.example.senac_marketing.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.time.LocalDate;
@Entity

public class ExpAnterior extends  EntiyId{
    @Column(name = "descricao", nullable = false)
    private String descricao;
    @Column(name = "cargo", nullable = false)
    private Cargo cargo;
    @Column(name = "periodoInicio", nullable = false)
    private LocalDate periodoInicio;
    @Column(name = "periodoFim", nullable = false)
    private LocalDate periodoFim;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
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

    @Override
    public String toString() {
        return "ExpAnterior{" +
                "descricao='" + descricao + '\'' +
                ", cargo=" + cargo +
                ", periodoInicio=" + periodoInicio +
                ", periodoFim=" + periodoFim +
                '}';
    }
}
