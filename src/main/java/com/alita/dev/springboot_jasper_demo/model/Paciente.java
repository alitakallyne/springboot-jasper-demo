package com.alita.dev.springboot_jasper_demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {

    private Long id;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private String planoSaude;
    private String numeroCarteirinha;
    private String validadeCarteirinha;
    private String nomeResponsavel;
    private String observacoes;

}
