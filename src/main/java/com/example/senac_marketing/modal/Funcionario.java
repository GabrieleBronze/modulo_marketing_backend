package com.example.senac_marketing.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.time.LocalTime;
@Entity
public class Funcionario extends EntiyId{

    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "CPF", nullable = false)
    private String CPF;
    @Column(name = "RG",nullable = false)
    private String RG;
    @Column(name = "endereco", nullable = false)
    private String endereco;
    @Column(name = "CTPS", nullable = false)
    private String CTPS;
    @Column(name = "salario", nullable = false)
    private Double salario;
    @Column(name = "cargaHoraria", nullable = false)
    private Integer cargaHoraria;
    @Column(name = "tituloEleitor", nullable = false)
    private String tituloEleitor;
    @Column(name = "cadastroReservista", nullable = false)
    private String cadastroReservista;
    @Column(name = "dataNascimento", nullable = false)
    private LocalDate dataNascimento;
    @Column(name = "PIS", nullable = false)
    private String PIS;
    @Column(name = "registroProficional", nullable = false)
    private String registroProficional;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "sindicato", nullable = false)
    private String sindicato;
    @Column(name = "setor", nullable = false)
    private String setor;
    @Column(name = "CNH", nullable = false)
    private String CNH;
    @Column(name = "dataAdmissao", nullable = false)
    private LocalDate dataAdmissao;
    @Column(name = "racaCor", nullable = false)
    private String racaCor;
    @Column(name = "religiao", nullable = false)
    private String religiao;
    @Column(name = "doadorDeSangue", nullable = false)
    private Boolean doadorDeSangue;
    @Column(name = "nacionalidade", nullable = false)
    private String nacionalidade;
    @Column(name = "redeSocial", nullable = false)
    private String redeSocial;
    @Column(name = "atuacao", nullable = false)
    private String atuacao;
    @Column(name = "matricula", nullable = false)
    private String matricula;
    @Column(name = "idioma", nullable = false)
    private String idioma;
    @Column(name = "HoraExtra", nullable = false)
    private Integer horaExtra;
    @Column(name = "horaEntrada", nullable = false)
    private LocalTime horaEntrada;
    @Column(name = "horaSaida", nullable = false)
    private LocalTime horaSaida;
    @Column(name = "telefone", nullable = false)
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "Cargo")
    private Cargo cargo;

    @ManyToOne
    @JoinColumn(name = "Certificacao")
    private Certificacao certificacao;

    @ManyToOne
    @JoinColumn(name = "Filiacao")
    private Filiacao filiacao;

    @ManyToOne
    @JoinColumn(name = "ExpAnterior")
    private ExpAnterior expAnterior;

    @ManyToOne
    @JoinColumn(name = "Dependente")
    private Dependente dependente;

    @ManyToOne
    @JoinColumn(name = "DadoBancario")
    private DadoBancario dadoBancario;



    @Column(name = "escolaridade", nullable = false)
    private Escolaridade escolaridade;

    @Column(name = "estadoCivil", nullable = false)
    private EstadoCivil estadoCivil;

    @Column(name = "genero", nullable = false)
    private Genero genero;

    @Column(name = "modalidadeContratual", nullable = false)
    private ModalidadeContratual modalidadeContratual;

    @Column(name = "status", nullable = false)
    private Status status;

    @Column(name = "tipoConta", nullable = false)
    private TipoConta tipoConta;

    @Column(name = "tipoSanguineo", nullable = false)
    private TipoSanguineo tipoSanguineo;

    @Column(name = "turno", nullable = false)
    private Turno turno;




}
