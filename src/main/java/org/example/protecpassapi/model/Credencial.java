package org.example.protecpassapi.model;

import jakarta.persistence.*;
import lombok.*;
import org.example.protecpassapi.dto.entrada.DadosCadastroCredencial;

@Entity(name = "credenciais")
@Table(name = "Credenciais")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Credencial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String username;

    private String senha;

    private String uri;

    private String descricao;

    private boolean ativo;

    public Credencial(DadosCadastroCredencial credencial){
        this.titulo = credencial.titulo();
        this.username = credencial.username();
        this.senha = credencial.senha();
        this.uri = credencial.uri();
        this.descricao = credencial.descricao();
        this.ativo = true;
    }
}
