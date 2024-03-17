package com.example.senac_marketing.modal;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class Dependente {
    @Column(name = "nome", nullable = false)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "escolaridade")
    private escolaridade Escolaridade;
    @Column(name = "dataNascimento", nullable = false)
    private LocalDate DataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public escolaridade getEscolaridade() {
        return Escolaridade;
    }

    public void setEscolaridade(escolaridade escolaridade) {
        Escolaridade = escolaridade;
    }

    public LocalDate getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        DataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "dependente{" +
                "nome='" + nome + '\'' +
                ", Escolaridade=" + Escolaridade +
                ", DataNascimento=" + DataNascimento +
                '}';
    }
}
