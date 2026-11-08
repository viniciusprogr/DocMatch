package com.docmatch.userservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public record DadosCadastroUsuario(

        @NotBlank
        String nome,

        @NotNull
        @Past
        Integer datanascimento,

        @NotBlank
        String email,

        @NotBlank
        String senha
) {
}
