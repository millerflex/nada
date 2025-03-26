package com.liga.equipos_service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "equipos")
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "fundado", nullable = false)
    private String fundado;

    @Column(name = "ciudad", nullable = false)
    private String ciudad;

    @Column(name = "estadio", nullable = false)
    private String estadio;

    @Column(name = "entrenador", nullable = false)
    private String entrenador;

    @Column(name = "idliga", nullable = false)
    private Long idLiga;

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public Long getIdLiga() {
        return idLiga;
    }
    public void setIdLiga(Long idLiga) {
        this.idLiga = idLiga;
    }


    public void setFundado(String fundado) {
        this.fundado = fundado;
    }
    public String getFundado() {
        return fundado;
    }

    

}
