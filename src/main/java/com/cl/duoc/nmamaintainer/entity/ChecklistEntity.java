package com.cl.duoc.nmamaintainer.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="checklist", schema="nma")
public class ChecklistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_checklist")
    private Integer id;

    @Column(name="estado_checklist", nullable = false)
    private String estadoChecklist;

    @Column(name="comentario")
    private String comentario;

    @Column(name="id_cliente")
    private String idCliente;

    @Column(name="id_profesional")
    private String idProfesional;

    @Column(name="nombre_checklist")
    private String nombreChecklist;

    @Column(name="fecha_creacion")
    private LocalDate fechaCreacion;

    @Column(name="fecha_revision")
    private LocalDate fechaRevision;

    @Column(name="fecha_cierre")
    private LocalDate fechaCierre;

    @Column(name="id_visita")
    private String idVisita;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstadoChecklist() {
        return estadoChecklist;
    }

    public void setEstadoChecklist(String estadoChecklist) {
        this.estadoChecklist = estadoChecklist;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(String idProfesional) {
        this.idProfesional = idProfesional;
    }

    public String getNombreChecklist() {
        return nombreChecklist;
    }

    public void setNombreChecklist(String nombreChecklist) {
        this.nombreChecklist = nombreChecklist;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(LocalDate fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public LocalDate getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDate fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(String idVisita) {
        this.idVisita = idVisita;
    }
}
