package com.example.demo.infrastructure.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaJpaRepository extends JpaRepository<ConsultaEntity, Long> {
}