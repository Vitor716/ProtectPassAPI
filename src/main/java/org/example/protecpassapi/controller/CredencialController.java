package org.example.protecpassapi.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.example.protecpassapi.dto.entrada.DadosCadastroCredencial;
import org.example.protecpassapi.dto.saida.DadosRetornoCredencial;
import org.example.protecpassapi.service.CredencialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/credencial")
public class CredencialController {

    @Autowired
    private CredencialService service;

    @PostMapping
    @Transactional
    public DadosRetornoCredencial cadastrar(@RequestBody @Valid DadosCadastroCredencial dados){
        return service.cadastrar(dados);
    }
}
