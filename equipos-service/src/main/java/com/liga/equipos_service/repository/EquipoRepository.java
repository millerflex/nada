package com.liga.equipos_service.repository;

import com.liga.equipos_service.model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {
    // Encuentra equipos por idLiga
    List<Equipo> findByIdLiga(Long idLiga);
}
