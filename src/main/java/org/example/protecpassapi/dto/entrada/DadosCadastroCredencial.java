package org.example.protecpassapi.dto.entrada;

public record DadosCadastroCredencial (
        String username,

        String senha,

        String uri,

        String descricao
){
}
