package com.example.partidos_service.repository;

import com.example.partidos_service.model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PartidoRepository extends JpaRepository<Partido, Long> {
    // Método para obtener partidos por id de liga y jornada
    List<Partido> findByIdligaAndJornada(Long idLiga, int jornada);
}