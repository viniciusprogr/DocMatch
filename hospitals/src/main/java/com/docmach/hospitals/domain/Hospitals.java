package com.docmach.hospitals.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hospitais")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hospitals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "NOME nao pode ser nulo!")
    private String nome;

    private String descricao;

    @NotBlank(message = "BAIRRO nao pode ser nulo!")
    private String bairro;

    @NotBlank(message = "CIDADE nao pode ser nulo!")
    private String cidade;

    @NotBlank(message = "ESTADO nao pode ser nulo!")
    private String estado;

    @NotBlank(message = "CEP nao pode ser nulo!")
    private String cep;
    private Double latitude;
    private Double longitude;


}
