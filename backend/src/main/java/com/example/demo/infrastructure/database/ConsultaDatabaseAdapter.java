package com.example.demo.infrastructure.database;

import com.example.demo.application.ports.SalvarConsultaPort;
import com.example.demo.domain.Consulta;
import org.springframework.stereotype.Component;

@Component
public class ConsultaDatabaseAdapter implements SalvarConsultaPort {

    private final ConsultaJpaRepository repository;

    public ConsultaDatabaseAdapter(ConsultaJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Consulta salvar(Consulta consulta) {
        // 1. Transforma o Domínio (Consulta) em Tabela (ConsultaEntity)
        ConsultaEntity entity = new ConsultaEntity();
        entity.setPacienteId(consulta.getPacienteId());
        entity.setMedicoId(consulta.getMedicoId());
        entity.setDataHora(consulta.getDataHora());
        entity.setStatus(consulta.getStatus());

        // 2. Salva no Postgres
        ConsultaEntity salva = repository.save(entity);

        // 3. Atualiza o ID do nosso Domínio e devolve
        consulta.setId(salva.getId());
        return consulta;
    }
}