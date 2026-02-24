# 📄 Spring Boot + JasperReports (Java 17)

Projeto de demonstração para geração de **relatórios PDF** utilizando **Spring Boot**, **Java 17** e **JasperReports**, com dados **mockados** (sem banco de dados).

Este projeto tem como objetivo servir como **base de estudo**, **portfólio** e **referência** para quem deseja entender como funciona a integração do JasperReports em aplicações modernas com Spring Boot.

---

## 🚀 Tecnologias Utilizadas

- ☕ Java 17  
- 🌱 Spring Boot  
- 📊 JasperReports 6.x  
- 📄 PDF (exportação de relatórios)
- 🧪 Dados mockados (JRBeanCollectionDataSource)
- 🛠 Maven

---

## 📂 Estrutura do Projeto

```text
src/main/java
 └── com.alita.dev.springboot_jasper_demo
     ├── controller
     │   └── RelatorioController.java
     ├── service
     │   └── RelatorioService.java
     ├── dto
     │   └── LaudoDTO.java
     └── mock
         └── LaudoMock.java

src/main/resources
 └── reports
     └── exames.jrxml
```

## ▶️ Como Executar o Projeto
1️⃣ Clonar o repositório
```
git clone https://github.com/seu-usuario/springboot-jasper-demo.git
```
2️⃣ Acessar o projeto
```
cd springboot-jasper-demo
```
3️⃣ Rodar a aplicação
```
./mvnw spring-boot:run
```
ou pelo botão Run da sua IDE.

## 👩‍💻 Autora

Alita Kallyne
Projeto criado para estudo e evolução profissional em Java e Spring Boot.

## 📜 Licença

Este projeto é de uso livre para fins de estudo e aprendizado.
