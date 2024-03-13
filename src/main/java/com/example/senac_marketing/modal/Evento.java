package com.example.senac_marketing.modal;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.List;

public class Evento {

    private String nome;
    private String local;
    private LocalDate periodoInicio;
    private LocalDate periodoFim;
    private Double valor;
    private String descricao;

    private List<TipoEvento> tiposEventos;



    private responsavel responsavel;
}
