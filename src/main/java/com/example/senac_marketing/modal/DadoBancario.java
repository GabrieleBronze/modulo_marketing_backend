package com.example.senac_marketing.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class DadoBancario extends  EntiyId{
    @Column(name = "banco", nullable = false)
    private String banco;
    @Column(name = "agencia", nullable = false)
    private String agencia;
    @Column(name = "conta", nullable = false)
    private String conta;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "DadoBancario{" +
                "banco='" + banco + '\'' +
                ", agencia='" + agencia + '\'' +
                ", conta='" + conta + '\'' +
                '}';
    }
}
