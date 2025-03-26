package com.liga.equipos_service.controller;

import com.liga.equipos_service.model.Equipo;
import com.liga.equipos_service.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/equipos")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @GetMapping
    public List<Equipo> obtenerEquipos() {
        return equipoService.obtenerTodosEquipos();
    }

    @GetMapping("/{id}")
    public Optional<Equipo> obtenerEquipo(@PathVariable Long id) {
        return equipoService.obtenerEquipoPorId(id);
    }

    @GetMapping("/filtrar")
    public List<Equipo> obtenerEquiposPorLiga(@RequestParam(required = false) Long idLiga) {
        if (idLiga != null) {
            return equipoService.obtenerEquiposPorLiga(idLiga);
        } else {
            return equipoService.obtenerTodosEquipos();
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Equipo crearEquipo(@RequestBody Equipo equipo) {
        return equipoService.guardarEquipo(equipo);
    }

    @PutMapping("/{id}")
    public Equipo actualizarEquipo(@PathVariable Long id, @RequestBody Equipo equipo) {
        return equipoService.actualizarEquipo(id, equipo);
    }
  

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarEquipo(@PathVariable Long id) {
        equipoService.eliminarEquipo(id);
    }
}
