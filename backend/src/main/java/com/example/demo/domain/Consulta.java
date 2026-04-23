package com.example.demo.domain;

import java.time.LocalDateTime;

public class Consulta {
    private Long id;
    private Long pacienteId;
    private Long medicoId;
    private LocalDateTime dataHora;
    private String status; // Ex: "PENDENTE", "PROCESSANDO", "CONFIRMADA"

    public Consulta(Long pacienteId, Long medicoId, LocalDateTime dataHora) {
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
        this.dataHora = dataHora;
        this.status = "PENDENTE"; // Toda consulta nasce pendente antes de ir pra fila
    }

    public void confirmar() {
        this.status = "CONFIRMADA";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }

    public Long getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(Long medicoId) {
        this.medicoId = medicoId;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}