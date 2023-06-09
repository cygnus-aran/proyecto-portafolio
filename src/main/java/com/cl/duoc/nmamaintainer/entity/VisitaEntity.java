package com.cl.duoc.nmamaintainer.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "visita", schema = "nma")
public class VisitaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_visita")
    private Integer idVisita;

    @Column(name = "fecha_visita", nullable = false)
    private Date fechaVisita;

    @Column(name = "descripcion_visita", nullable = false)
    private String descripcionVisita;

    @Column(name = "nombre_profesional", nullable = false)
    private String nombreProfesional;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "persona_run_persona", nullable = false)
    private String personaRunPersona;

    @Column(name = "id_empresa", nullable = false)
    private String idEmpresa;

    @Column(name = "valor", nullable = false)
    private String valor;

    public Integer getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(Integer idVisita) {
        this.idVisita = idVisita;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getDescripcionVisita() {
        return descripcionVisita;
    }

    public void setDescripcionVisita(String descripcionVisita) {
        this.descripcionVisita = descripcionVisita;
    }

    public String getNombreProfesional() {
        return nombreProfesional;
    }

    public void setNombreProfesional(String nombreProfesional) {
        this.nombreProfesional = nombreProfesional;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPersonaRunPersona() {
        return personaRunPersona;
    }

    public void setPersonaRunPersona(String personaRunPersona) {
        this.personaRunPersona = personaRunPersona;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}