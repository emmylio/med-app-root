# 🏛 Documentação de Arquitetura e Design de Software

## 1. Escolha Arquitetural: Arquitetura Hexagonal (Ports and Adapters)

Para o desenvolvimento do sistema de consultas médicas, optamos pela **Arquitetura Hexagonal**. 

### 1.1 Justificativa
A escolha se baseia na necessidade de criar um sistema resiliente, escalável e com alta manutenibilidade, isolando as regras de negócio de tecnologias externas. Como o projeto exige o uso de mensageria assíncrona, a Arquitetura Hexagonal permite que o banco de dados e as filas de mensagens funcionem como "adaptadores" plugáveis. Isso garante que a lógica central (o agendamento da consulta) permaneça limpa e independente da infraestrutura, facilitando os testes unitários e a aplicação dos princípios SOLID.

## 2. Diagramas C4 Model
<img width="820" height="456" alt="Captura de tela 2026-04-14 232955" src="https://github.com/user-attachments/assets/49ca4ece-2448-4859-bfb4-f3ff7fd249bd" />
<img width="698" height="420" alt="Captura de tela 2026-04-14 233009" src="https://github.com/user-attachments/assets/d853afe2-35c8-4fb3-a5cf-cbd8905d2217" />
