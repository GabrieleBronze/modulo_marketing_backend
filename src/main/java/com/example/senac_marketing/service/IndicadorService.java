package com.example.senac_marketing.service;

import com.example.senac_marketing.modal.Indicador;
import com.example.senac_marketing.repository.IndicadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;


@Service
public class IndicadorService {

    @Autowired
    private static IndicadorRepository indicadorRepository;

    public static Indicador salvar(Indicador entity) {
        return indicadorRepository.save(entity);
    }

    public List<Indicador> buscaTodos() {
        return indicadorRepository.findAll();
    }

    public Indicador buscarPorId(Long id) {
        return indicadorRepository.findById(id).orElse(null);
    }

    public Indicador alterar(Long id, Indicador alterado) {
        Optional<Indicador> encontrado = indicadorRepository.findById(id);
        if (encontrado.isPresent()) {
            Indicador indicador = encontrado.get();
            indicador.setNome(alterado.getNome());
            indicador.setDescricao(alterado.getDescricao());
            indicador.setSetor(alterado.getSetor());

            return indicadorRepository.save(indicador);
        }

        return null;
    }

    public void remover(Long id) {
        indicadorRepository.deleteById(id);

    }

}
