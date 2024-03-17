package com.example.senac_marketing.modal;

import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.time.LocalTime;
@Entity
public class funcionario extends  EntiyId{

    private String nome;
    private String CPF;
    private String RG;
    private String endereco;
    private String CTPS;
    private Double salario;
    private Integer cargaHoraria;
    private String tituloEleitor;
    private String cadastroReservista;
    private LocalDate dataNascimento;
    private String PIS;
    private String registroProficional;
    private String email;
    private String sindicato;
    private String setor;
    private String CNH;
    private LocalDate dataAdmissao;
    private String racaCor;
    private String religiao;
    private Boolean doadorDeSangue;
    private String nacionalidade;
    private String redeSocial;
    private String atuacao;
    private String matricula;
    private String idioma;
    private Integer horaExtra;
    private LocalTime horaEntrada;
    private LocalTime horaSaida;
    private String telefone;

    private Cargo Cargo;
    private Certificacao Certificacao;
    private filiacao Filiacao;
    private ExpAnterior ExpAnterior;
    private Dependente Dependente;
    private DadoBancario DadoBancario;

    private escolaridade Escolaridade;
    private estadoCivil EstadoCivil;
    private genero Genero;
    private modalidadeContratual ModalidadeContratual;
    private status Status;
    private tipoConta TipoConta;
    private tipoSanguineo TipoSanguineo;
    private turno Turno;


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


    public com.example.senac_marketing.modal.Cargo getCargo() {
        return Cargo;
    }

    public void setCargo(com.example.senac_marketing.modal.Cargo cargo) {
        Cargo = cargo;
    }

    public com.example.senac_marketing.modal.Certificacao getCertificacao() {
        return Certificacao;
    }

    public void setCertificacao(com.example.senac_marketing.modal.Certificacao certificacao) {
        Certificacao = certificacao;
    }

    public void setDependente(com.example.senac_marketing.modal.Dependente dependente) {
        Dependente = dependente;
    }

    public filiacao getFiliacao() {
        return Filiacao;
    }

    public void setFiliacao(filiacao filiacao) {
        Filiacao = filiacao;
    }

    public com.example.senac_marketing.modal.ExpAnterior getExpAnterior() {
        return ExpAnterior;
    }

    public void setExpAnterior(com.example.senac_marketing.modal.ExpAnterior expAnterior) {
        ExpAnterior = expAnterior;
    }


    public com.example.senac_marketing.modal.DadoBancario getDadoBancario() {
        return DadoBancario;
    }

    public void setDadoBancario(com.example.senac_marketing.modal.DadoBancario dadoBancario) {
        DadoBancario = dadoBancario;
    }

    public escolaridade getEscolaridade() {
        return Escolaridade;
    }

    public void setEscolaridade(escolaridade escolaridade) {
        Escolaridade = escolaridade;
    }

    public estadoCivil getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(estadoCivil estadoCivil) {
        EstadoCivil = estadoCivil;
    }

    public genero getGenero() {
        return Genero;
    }

    public void setGenero(genero genero) {
        Genero = genero;
    }

    public modalidadeContratual getModalidadeContratual() {
        return ModalidadeContratual;
    }

    public void setModalidadeContratual(modalidadeContratual modalidadeContratual) {
        ModalidadeContratual = modalidadeContratual;
    }

    public status getStatus() {
        return Status;
    }

    public void setStatus(status status) {
        Status = status;
    }

    public tipoConta getTipoConta() {
        return TipoConta;
    }

    public void setTipoConta(tipoConta tipoConta) {
        TipoConta = tipoConta;
    }

    public tipoSanguineo getTipoSanguineo() {
        return TipoSanguineo;
    }

    public void setTipoSanguineo(tipoSanguineo tipoSanguineo) {
        TipoSanguineo = tipoSanguineo;
    }

    public turno getTurno() {
        return Turno;
    }

    public void setTurno(turno turno) {
        Turno = turno;
    }


    @Override
    public String toString() {
        return "funcionario{" +
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
                ", Cargo=" + Cargo +
                ", Certificacao=" + Certificacao +
                ", Filiacao=" + Filiacao +
                ", ExpAnterior=" + ExpAnterior +
                ", Dependente=" + Dependente +
                ", DadoBancario=" + DadoBancario +
                ", Escolaridade=" + Escolaridade +
                ", EstadoCivil=" + EstadoCivil +
                ", Genero=" + Genero +
                ", ModalidadeContratual=" + ModalidadeContratual +
                ", Status=" + Status +
                ", TipoConta=" + TipoConta +
                ", TipoSanguineo=" + TipoSanguineo +
                ", Turno=" + Turno +
                '}';
    }
}
