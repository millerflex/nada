package com.liga.equipos_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liga.equipos_service.model.Equipo;
import com.liga.equipos_service.repository.EquipoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    // Obtener todos los equipos
    public List<Equipo> obtenerTodosEquipos() {
        return equipoRepository.findAll();
    }

    // Obtener un equipo por su ID
    public Optional<Equipo> obtenerEquipoPorId(Long id) {
        return equipoRepository.findById(id);
    }

    // Filtrar equipos por idLiga
    public List<Equipo> obtenerEquiposPorLiga(Long idLiga) {
        return equipoRepository.findByIdLiga(idLiga);
    }

    // Guardar un nuevo equipo
    public Equipo guardarEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    // Actualizar un equipo existente
    public Equipo actualizarEquipo(Long id, Equipo equipoActualizado) {
        return equipoRepository.findById(id).map(equipo -> {
            equipo.setNombre(equipoActualizado.getNombre());
            equipo.setCiudad(equipoActualizado.getCiudad());
            equipo.setEstadio(equipoActualizado.getEstadio());
            equipo.setEntrenador(equipoActualizado.getEntrenador());
            equipo.setIdLiga(equipoActualizado.getIdLiga());
            return equipoRepository.save(equipo);
        }).orElseThrow(() -> new RuntimeException("Equipo no encontrado con el ID: " + id));
    }

    // Eliminar un equipo por su ID
    public void eliminarEquipo(Long id) {
        equipoRepository.deleteById(id);
    }
}
