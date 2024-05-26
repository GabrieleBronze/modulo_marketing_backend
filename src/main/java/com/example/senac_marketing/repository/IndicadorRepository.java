package com.example.senac_marketing.repository;

import com.example.senac_marketing.modal.Indicador;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IndicadorRepository extends JpaRepository<Indicador, Long>{
}