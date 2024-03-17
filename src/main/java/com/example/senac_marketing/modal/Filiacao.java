package com.example.senac_marketing.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Filiacao extends EntiyId{
    @Column(name ="NomePai", nullable = false)
    private String NomePai;
    @Column(name = "NomeMae", nullable = false)
    private String NomeMae;
    @Column(name = "FonePai", nullable = false)
    private String FonePai;
    @Column(name = "FoneMae", nullable = false)
    private String FoneMae;

    public String getNomePai() {
        return NomePai;
    }

    public void setNomePai(String nomePai) {
        NomePai = nomePai;
    }

    public String getNomeMae() {
        return NomeMae;
    }

    public void setNomeMae(String nomeMae) {
        NomeMae = nomeMae;
    }

    public String getFonePai() {
        return FonePai;
    }

    public void setFonePai(String fonePai) {
        FonePai = fonePai;
    }

    public String getFoneMae() {
        return FoneMae;
    }

    public void setFoneMae(String foneMae) {
        FoneMae = foneMae;
    }

    @Override
    public String toString() {
        return "Filiacao{" +
                "NomePai='" + NomePai + '\'' +
                ", NomeMae='" + NomeMae + '\'' +
                ", FonePai='" + FonePai + '\'' +
                ", FoneMae='" + FoneMae + '\'' +
                '}';
    }
}
