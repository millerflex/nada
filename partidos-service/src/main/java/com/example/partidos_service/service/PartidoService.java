package com.example.partidos_service.service;



import com.example.partidos_service.model.Partido;
import com.example.partidos_service.repository.PartidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidoService {

    private final PartidoRepository partidoRepository;

    public PartidoService(PartidoRepository partidoRepository) {
        this.partidoRepository = partidoRepository;
    }

    public List<Partido> getAllPartidos() {
        return partidoRepository.findAll();
    }

    public Partido savePartido(Partido partido) {
        return partidoRepository.save(partido);
    }
    public List<Partido> obtenerPartidosPorLigaYJornada(Long idLiga, int jornada) {
        return partidoRepository.findByIdligaAndJornada(idLiga, jornada);
    }
    
}
