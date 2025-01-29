package org.example.protecpassapi.repository;

import org.example.protecpassapi.dto.saida.DadosRetornoCredencial;
import org.example.protecpassapi.model.Credencial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CredencialRepository extends JpaRepository<Credencial, Long> {
    List<DadosRetornoCredencial> findAllByAtivoTrue();
}
