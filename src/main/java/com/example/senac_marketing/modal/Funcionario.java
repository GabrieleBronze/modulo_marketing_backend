package com.example.senac_marketing.modal;

import jakarta.persistence.*;

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
    private Certificacao certificacao; // lista?

    @ManyToOne
    @JoinColumn(name = "Filiacao")
    private Filiacao filiacao; // lista?

    @ManyToOne
    @JoinColumn(name = "ExpAnterior")
    private ExpAnterior expAnterior; // lista?

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCTPS() {
        return CTPS;
    }

    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    public String getCadastroReservista() {
        return cadastroReservista;
    }

    public void setCadastroReservista(String cadastroReservista) {
        this.cadastroReservista = cadastroReservista;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPIS() {
        return PIS;
    }

    public void setPIS(String PIS) {
        this.PIS = PIS;
    }

    public String getRegistroProficional() {
        return registroProficional;
    }

    public void setRegistroProficional(String registroProficional) {
        this.registroProficional = registroProficional;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSindicato() {
        return sindicato;
    }

    public void setSindicato(String sindicato) {
        this.sindicato = sindicato;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getRacaCor() {
        return racaCor;
    }

    public void setRacaCor(String racaCor) {
        this.racaCor = racaCor;
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }

    public Boolean getDoadorDeSangue() {
        return doadorDeSangue;
    }

    public void setDoadorDeSangue(Boolean doadorDeSangue) {
        this.doadorDeSangue = doadorDeSangue;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Integer getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(Integer horaExtra) {
        this.horaExtra = horaExtra;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Certificacao getCertificacao() {
        return certificacao;
    }

    public void setCertificacao(Certificacao certificacao) {
        this.certificacao = certificacao;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }

    public ExpAnterior getExpAnterior() {
        return expAnterior;
    }

    public void setExpAnterior(ExpAnterior expAnterior) {
        this.expAnterior = expAnterior;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    public DadoBancario getDadoBancario() {
        return dadoBancario;
    }

    public void setDadoBancario(DadoBancario dadoBancario) {
        this.dadoBancario = dadoBancario;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public ModalidadeContratual getModalidadeContratual() {
        return modalidadeContratual;
    }

    public void setModalidadeContratual(ModalidadeContratual modalidadeContratual) {
        this.modalidadeContratual = modalidadeContratual;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", RG='" + RG + '\'' +
                ", endereco='" + endereco + '\'' +
                ", CTPS='" + CTPS + '\'' +
                ", salario=" + salario +
                ", cargaHoraria=" + cargaHoraria +
                ", tituloEleitor='" + tituloEleitor + '\'' +
                ", cadastroReservista='" + cadastroReservista + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", PIS='" + PIS + '\'' +
                ", registroProficional='" + registroProficional + '\'' +
                ", email='" + email + '\'' +
                ", sindicato='" + sindicato + '\'' +
                ", setor='" + setor + '\'' +
                ", CNH='" + CNH + '\'' +
                ", dataAdmissao=" + dataAdmissao +
                ", racaCor='" + racaCor + '\'' +
                ", religiao='" + religiao + '\'' +
                ", doadorDeSangue=" + doadorDeSangue +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", redeSocial='" + redeSocial + '\'' +
                ", atuacao='" + atuacao + '\'' +
                ", matricula='" + matricula + '\'' +
                ", idioma='" + idioma + '\'' +
                ", horaExtra=" + horaExtra +
                ", horaEntrada=" + horaEntrada +
                ", horaSaida=" + horaSaida +
                ", telefone='" + telefone + '\'' +
                ", cargo=" + cargo +
                ", certificacao=" + certificacao +
                ", filiacao=" + filiacao +
                ", expAnterior=" + expAnterior +
                ", dependente=" + dependente +
                ", dadoBancario=" + dadoBancario +
                ", escolaridade=" + escolaridade +
                ", estadoCivil=" + estadoCivil +
                ", genero=" + genero +
                ", modalidadeContratual=" + modalidadeContratual +
                ", status=" + status +
                ", tipoConta=" + tipoConta +
                ", tipoSanguineo=" + tipoSanguineo +
                ", turno=" + turno +
                '}';
    }
}
