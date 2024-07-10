package com.example.senac_marketing.resourse.representation;

import com.example.senac_marketing.modal.Evento;
import com.example.senac_marketing.modal.Indicador;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.List;
import java.util.stream.Collectors;

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
        indicador.setSetor(this.getSetor());
        indicador.setDescricao(this.getDescricao());
        indicador.setDescricao((this.getDescricao()));

        return indicador;
    }

    public static List<IndicadorDTO> fromEntity(List<Indicador> Indicador) {
        return Indicador.stream().map(IndicadorDTO::fromEntity).collect(Collectors.toList());
    }

    public static Page<IndicadorDTO> fromEntity(Page<Indicador> Indicador) {
        List<IndicadorDTO> clientesFind = Indicador.stream().map(IndicadorDTO::fromEntity).collect(Collectors.toList());
        return new PageImpl<>(clientesFind, Indicador.getPageable(), Indicador.getTotalElements());
    }
}
