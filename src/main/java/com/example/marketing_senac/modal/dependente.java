package com.example.marketing_senac.modal;

import java.time.LocalDate;

public class dependente {
    private String nome;
    private escolaridade Escolaridade;
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
