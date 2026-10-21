package com.docmatch.userservice.service;

import com.docmatch.userservice.dto.DadosCadastroUsuario;
import com.docmatch.userservice.model.Usuario;
import com.docmatch.userservice.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;

public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final ModelMapper modelMapper;

    public UsuarioService(UsuarioRepository usuarioRepository, ModelMapper modelMapper) {
        this.usuarioRepository = usuarioRepository;
        this.modelMapper = modelMapper;
    }

    public Usuario cadastrarUsuario(DadosCadastroUsuario dados) {

        Usuario user = modelMapper.map(dados, Usuario.class);
        return usuarioRepository.save(user);

    }
}
