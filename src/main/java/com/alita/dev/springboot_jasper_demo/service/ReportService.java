package com.alita.dev.springboot_jasper_demo.service;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.alita.dev.springboot_jasper_demo.dto.LaudoDTO;
import com.alita.dev.springboot_jasper_demo.mock.LaudoMock;
import com.alita.dev.springboot_jasper_demo.model.Paciente;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class ReportService {

    public byte[] gerarRelatorioPaciente() throws JRException {

          List<LaudoDTO> dados = LaudoMock.gerar();

        // Caminho do template JRXML
        InputStream reportStream = getClass().getResourceAsStream("/static/exame.jrxml");

        // Compilar o template
        JasperReport jasperReport = JasperCompileManager.compileReport(reportStream);

        // Fonte de dados
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dados);

        // Parâmetros (exemplo: logo)
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("LOGO", getClass().getResourceAsStream("/static/logo.png"));

        // Preencher relatório
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, dataSource);

        // Exportar para PDF
        return JasperExportManager.exportReportToPdf(jasperPrint);
    }
}
