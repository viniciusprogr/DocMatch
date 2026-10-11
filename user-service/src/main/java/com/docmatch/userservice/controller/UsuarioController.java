package com.docmatch.userservice.controller;

import com.docmatch.userservice.dto.DadosCadastroUsuario;
import com.docmatch.userservice.dto.DadosDetalhamentoUsuario;
import com.docmatch.userservice.model.Usuario;
import com.docmatch.userservice.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<?> cadastrarUsuario(@RequestBody @Valid DadosCadastroUsuario dados) {

        usuarioService.cadastrarUsuario(dados);

        return ResponseEntity.status(201).body(Map.of("Mensagem", "Usuario cadastrado com sucesso"));
    }
}
