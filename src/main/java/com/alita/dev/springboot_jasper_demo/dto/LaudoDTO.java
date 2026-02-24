package com.alita.dev.springboot_jasper_demo.dto;

public record LaudoDTO(
     String nome,
     String cpf,
     String dataNascimento,
     String nomeExame,
     String resultado,
     String medicoResponsavel,
     String dtLaudo
) {

}
