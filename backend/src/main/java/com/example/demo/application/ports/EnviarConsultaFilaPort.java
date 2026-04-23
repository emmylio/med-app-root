package com.example.demo.application.ports;

import com.example.demo.domain.Consulta;

public interface EnviarConsultaFilaPort {
    void enviar(Consulta consulta);
}