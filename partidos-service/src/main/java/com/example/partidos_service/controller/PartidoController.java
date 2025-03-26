package com.example.partidos_service.controller;



import com.example.partidos_service.model.Partido;
import com.example.partidos_service.service.PartidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidos")
public class PartidoController {

    private final PartidoService partidoService;

    public PartidoController(PartidoService partidoService) {
        this.partidoService = partidoService;
    }

    @GetMapping
    public List<Partido> getAllPartidos() {
        return partidoService.getAllPartidos();
    }

    @PostMapping
    public Partido savePartido(@RequestBody Partido partido) {
        return partidoService.savePartido(partido);
    }
    @GetMapping("/jornada")
    public List<Partido> obtenerPartidosPorJornadaYLiga(
        @RequestParam Long idLiga, 
        @RequestParam int jornada) {
    return partidoService.obtenerPartidosPorLigaYJornada(idLiga, jornada);
}
}
