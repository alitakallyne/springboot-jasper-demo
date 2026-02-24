package com.alita.dev.springboot_jasper_demo.mock;

import java.util.List;

import com.alita.dev.springboot_jasper_demo.dto.LaudoDTO;

public class LaudoMock {

        public static List<LaudoDTO> gerar() {

        LaudoDTO laudo = new LaudoDTO(
                "Maria Oliveira",
                "123.456.789-00",
                "12/08/1990",
                "Hemograma Completo",
                "Resultado dentro dos padrões de normalidade.",
                "Dr. João Pereira",
                "24/02/2026"
        );

        return List.of(laudo);
    }

}
