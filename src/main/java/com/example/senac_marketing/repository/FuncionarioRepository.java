package com.example.senac_marketing.repository;

import com.example.senac_marketing.modal.funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<funcionario, Long> {


}
