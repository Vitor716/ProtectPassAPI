package org.example.protecpassapi.dto.entrada;

public record DadosCadastroCredencial (
        String titulo,

        String username,

        String senha,

        String uri,

        String descricao
){
}
