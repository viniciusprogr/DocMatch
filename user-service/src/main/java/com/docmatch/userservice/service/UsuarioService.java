package com.docmatch.userservice.service;

import com.docmatch.userservice.dto.DadosCadastroUsuario;
import com.docmatch.userservice.model.Usuario;
import com.docmatch.userservice.repository.UsuarioRepository;

public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario cadastrarUsuario(DadosCadastroUsuario dados) {

        var user = new Usuario(dados);
        return usuarioRepository.save(user);

    }
}
