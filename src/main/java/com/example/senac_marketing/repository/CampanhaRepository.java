package com.example.senac_marketing.repository;

import com.example.senac_marketing.Enterprise.CustomQuerydslPredicateExecutor;
import com.example.senac_marketing.modal.Campanha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampanhaRepository extends JpaRepository<Campanha, Long>{

}
