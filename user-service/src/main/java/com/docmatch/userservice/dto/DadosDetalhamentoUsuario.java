package com.docmatch.userservice.dto;

import com.docmatch.userservice.model.Usuario;

public record DadosDetalhamentoUsuario(
    Long id,
    String nome,
    String email
) {
    public DadosDetalhamentoUsuario(Usuario usuario){
        this(   usuario.getId(),
                usuario.getNome(),
                usuario.getEmail()

        );
    }
}
