package com.liga.ligas_service.controller;


import com.liga.ligas_service.model.Liga;
import com.liga.ligas_service.service.LigaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ligas")
public class LigaController {

    @Autowired
    private LigaService ligaService;

    @GetMapping
    public List<Liga> obtenerLigas() {
        return ligaService.obtenerTodasLigas();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Liga crearLiga(@RequestBody Liga liga) {
        return ligaService.guardarLiga(liga);
    }

    @DeleteMapping("/{id}")
    public void eliminarLiga(@PathVariable Long id) {
        ligaService.eliminarLiga(id);
    }
}