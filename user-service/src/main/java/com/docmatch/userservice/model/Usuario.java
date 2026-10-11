package com.docmatch.userservice.model;

import com.docmatch.userservice.dto.DadosCadastroUsuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String idade;
    private String email;

    public Usuario(DadosCadastroUsuario dados){
        this.nome = dados.nome();
        this.idade = dados.idade();
        this.email = dados.email();
    }

}
