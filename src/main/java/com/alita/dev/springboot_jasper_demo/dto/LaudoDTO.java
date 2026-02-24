package com.alita.dev.springboot_jasper_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LaudoDTO {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String nomeExame;
    private String resultado;
    private String medicoResponsavel;
    private String dtLaudo;
}
