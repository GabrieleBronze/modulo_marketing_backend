package com.example.senac_marketing.resourse.representation;

import com.example.senac_marketing.modal.Campanha;
import com.example.senac_marketing.modal.Evento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class EventoDTO {

    private Long id;

    private String nome;

    private String local;

    private LocalDate periodoInicio;

    private LocalDate periodoFim;

    private Float valor;

    private Float custo;

    private String conteudo;

    private String descricao;

    // Getters e Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
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

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Float getCusto() {
        return custo;
    }

    public void setCusto(Float custo) {
        this.custo = custo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Métodos de conversão
    public static EventoDTO fromEntity(Evento evento) {
        EventoDTO dto = new EventoDTO();
        dto.setId(evento.getId());
        dto.setNome(evento.getNome());
        dto.setLocal(evento.getLocal());
        dto.setPeriodoInicio(evento.getPeriodoInicio());
        dto.setPeriodoFim(evento.getPeriodoFim());
        dto.setValor(evento.getValor());
        dto.setCusto(evento.getCusto());
        dto.setCusto(evento.getCusto());
        dto.setDescricao(evento.getDescricao());
        return dto;
    }

    public Evento toEntity() {
        Evento evento = new Evento();
        evento.setId(this.getId());
        evento.setNome(this.getNome());
        evento.setLocal(this.getLocal());
        evento.setPeriodoInicio(this.getPeriodoInicio());
        evento.setPeriodoFim(this.getPeriodoFim());
        evento.setValor(this.getValor());
        evento.setCusto(this.getCusto());
        evento.setCusto(this.getCusto());
        evento.setDescricao(this.getDescricao());
        return evento;
    }

    public static List<EventoDTO> fromEntity(List<Evento> Evento) {
        return Evento.stream().map(EventoDTO::fromEntity).collect(Collectors.toList());
    }

    public static Page<EventoDTO> fromEntity(Page<Evento> Evento) {
        List<EventoDTO> eventos = Evento.stream().map(EventoDTO::fromEntity).collect(Collectors.toList());
        return new PageImpl<>(eventos, Evento.getPageable(), Evento.getTotalElements());
    }


}
