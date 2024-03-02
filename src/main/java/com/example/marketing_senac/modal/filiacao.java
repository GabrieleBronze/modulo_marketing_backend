package com.example.marketing_senac.modal;

public class filiacao {
    private String NomePai;
    private String NomeMae;
    private String FonePai;
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
        return "filiacao{" +
                "NomePai='" + NomePai + '\'' +
                ", NomeMae='" + NomeMae + '\'' +
                ", FonePai='" + FonePai + '\'' +
                ", FoneMae='" + FoneMae + '\'' +
                '}';
    }
}
