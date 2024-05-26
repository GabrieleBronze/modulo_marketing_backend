package com.example.senac_marketing.repository;

import com.example.senac_marketing.modal.Pesquisa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PesquisaRepository extends JpaRepository<Pesquisa, Long> {


}
