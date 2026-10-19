package com.docmach.hospitals.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HospitalsResponseDto {
    private String nome;
    private String descricao;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private Double latitude;
    private Double longitude;

}
