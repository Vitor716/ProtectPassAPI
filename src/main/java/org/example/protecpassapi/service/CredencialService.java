package org.example.protecpassapi.service;

import org.example.protecpassapi.dto.entrada.DadosCadastroCredencial;
import org.example.protecpassapi.dto.saida.DadosRetornoCredencial;
import org.example.protecpassapi.model.Credencial;
import org.example.protecpassapi.repository.CredencialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CredencialService {

    @Autowired
    private CredencialRepository repository;

    public DadosRetornoCredencial cadastrar(DadosCadastroCredencial dados){
        Credencial credencial = new Credencial(dados);
        Credencial credencialSalva = repository.save(credencial);
        return new DadosRetornoCredencial(credencialSalva);
    }
}
