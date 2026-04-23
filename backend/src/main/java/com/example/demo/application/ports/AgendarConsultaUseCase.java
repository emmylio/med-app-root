package com.example.demo.application.ports;

import com.example.demo.domain.Consulta;

public interface AgendarConsultaUseCase {
    Consulta solicitarAgendamento(Consulta consulta);
}