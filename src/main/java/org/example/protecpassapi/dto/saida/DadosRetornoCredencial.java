package org.example.protecpassapi.dto.saida;

import org.example.protecpassapi.model.Credencial;

public record DadosRetornoCredencial (
        Long id,

        String titulo,

        String username,

        String senha,

        String uri,

        String descricao,

        boolean ativo
){
    public DadosRetornoCredencial (Credencial credencial){
        this(
            credencial.getId(),
            credencial.getTitulo(),
            credencial.getUsername(),
            credencial.getSenha(),
            credencial.getUri(),
            credencial.getDescricao(),
            credencial.isAtivo());
    }
}
