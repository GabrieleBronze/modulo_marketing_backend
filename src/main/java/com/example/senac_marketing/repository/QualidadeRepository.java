package com.example.senac_marketing.repository;

import com.example.senac_marketing.modal.Qualidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualidadeRepository extends JpaRepository<Qualidade, Long> {
}
