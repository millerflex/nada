package com.liga.ligas_service.service;

import com.liga.ligas_service.model.Liga;
import com.liga.ligas_service.repository.LigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigaService {

    @Autowired
    private LigaRepository ligaRepository;

    public List<Liga> obtenerTodasLigas() {
        return ligaRepository.findAll();
    }

    public Liga guardarLiga(Liga liga) {
        return ligaRepository.save(liga);
    }

    public void eliminarLiga(Long id) {
        ligaRepository.deleteById(id);
    }
}