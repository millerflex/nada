package com.example.partidos_service.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "partidos")

public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "equipo_local_id", nullable = false)
    private Long equipoLocalId;

    @Column(name = "equipo_visitante_id", nullable = false)
    private Long equipoVisitanteId;

    @Column(name = "goles_local")
    private int golesLocal;

    @Column(name = "goles_visitante")
    private int golesVisitante;

    @Column(name = "fecha_partido", nullable = false)
    private LocalDate fechaPartido;

    @Column(name = "jornada", nullable = false)
    private Integer jornada;

    @Column(name = "idliga", nullable = false)
    private Long idliga;

    // Getters y Setters


    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEquipoLocalId() {
        return equipoLocalId;
    }

    public void setEquipoLocalId(Long equipoLocalId) {
        this.equipoLocalId = equipoLocalId;
    }

    public Long getEquipoVisitanteId() {
        return equipoVisitanteId;
    }

    public void setEquipoVisitanteId(Long equipoVisitanteId) {
        this.equipoVisitanteId = equipoVisitanteId;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(LocalDate fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    public Long getIdliga() {
        return idliga;
    }

    public void setIdliga(Long idliga) {
        this.idliga = idliga;
    }
}
