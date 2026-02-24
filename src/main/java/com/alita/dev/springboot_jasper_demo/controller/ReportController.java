package com.alita.dev.springboot_jasper_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alita.dev.springboot_jasper_demo.dto.LaudoDTO;
import com.alita.dev.springboot_jasper_demo.mock.LaudoMock;
import com.alita.dev.springboot_jasper_demo.model.Paciente;
import com.alita.dev.springboot_jasper_demo.service.ReportService;
import net.sf.jasperreports.engine.JRException;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ReportController {

    private final ReportService reportService;

    @GetMapping("/laudo-mock")
    public ResponseEntity<byte[]> gerar() throws JRException {

        byte[] pdf = reportService.gerarRelatorioPaciente();

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "inline; filename=laudo-mock.pdf")
                .contentType(MediaType.APPLICATION_PDF)
                .body(pdf);
    }
}
