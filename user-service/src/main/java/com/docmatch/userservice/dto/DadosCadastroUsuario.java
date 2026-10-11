package com.docmatch.userservice.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUsuario(

        @NotBlank
        String nome,

        @NotBlank
        String idade,

        @NotBlank
        String email;
) {
}
