package com.alita.dev.springboot_jasper_demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exames {

    private Long id;
    private String nomeExame;
    private String resultado;
    private String dataExame;
    private String observacoes;
    private String procedimento;
    private String dtLaudo;
    private String medicoResponsavel;
    private String Laudo;
    
 
}
