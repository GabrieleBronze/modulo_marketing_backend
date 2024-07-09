package com.example.senac_marketing.resourse.representation;

import com.example.senac_marketing.modal.Indicador;

public class IndicadorDTO {

    private  String nome;
    private String descricao;
    private  String setor;

    public String getNome() {return nome; }

    public void setNome(String nome) {this.nome = nome; }

    public String getDescricao() {return descricao; }

    public void setDescricao(String descricao) {this.descricao = descricao; }

    public String getSetor() {return setor; }

    public void setSetor(String setor) {this.setor = setor; }

    public static IndicadorDTO fromEntity(Indicador indicador){
        IndicadorDTO dto = new IndicadorDTO();
        dto.setNome(indicador.getNome());
        dto.setDescricao(indicador.getDescricao());
        dto.setSetor(indicador.getSetor());

        return  dto;
    }

    public  Indicador toEntity()  {
        Indicador indicador =  new Indicador();
        indicador.setNome(this.getNome());

        indicador.setDescricao((this.getDescricao()));


    }
}
