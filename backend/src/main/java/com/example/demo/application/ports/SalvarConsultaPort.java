package com.example.demo.application.ports;

import com.example.demo.domain.Consulta;

public interface SalvarConsultaPort {
    Consulta salvar(Consulta consulta);
}