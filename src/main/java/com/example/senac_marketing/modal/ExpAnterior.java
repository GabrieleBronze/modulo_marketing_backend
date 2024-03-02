package com.example.senac_marketing.modal;

import java.time.LocalDate;

public class ExpAnterior {
    private String descricaoExperiencia;
    private cargo Cargo;
    private LocalDate periodoInicio;
    private LocalDate periodoFim;

    public String getDescricaoExperiencia() {
        return descricaoExperiencia;
    }

    public void setDescricaoExperiencia(String descricaoExperiencia) {
        this.descricaoExperiencia = descricaoExperiencia;
    }

    public cargo getCargo() {
        return Cargo;
    }

    public void setCargo(cargo cargo) {
        Cargo = cargo;
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
                "descricaoExperiencia='" + descricaoExperiencia + '\'' +
                ", Cargo=" + Cargo +
                ", periodoInicio=" + periodoInicio +
                ", periodoFim=" + periodoFim +
                '}';
    }
}
