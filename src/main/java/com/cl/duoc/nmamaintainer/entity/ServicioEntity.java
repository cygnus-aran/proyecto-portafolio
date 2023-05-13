package com.cl.duoc.nmamaintainer.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "servicio", schema = "nma")
public class ServicioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_servicio")
    private Integer idServicio;

    @Column(name = "nombre_servicio", nullable = false)
    private String nombreServicio;

    @Column(name = "valor_servicio", nullable = false)
    private Double valorServicio;

    @Column(name = "descripcion_servicio")
    private String descripcionServicio;

    @Column(name = "fecha_creacion_servicio", nullable = false)
    private java.sql.Date fechaCreacionServicio;

    @Column(name = "fecha_baja_servicio")
    private java.sql.Date fechaBajaServicio;

    @Column(name = "episodio_id_episodio", nullable = false)
    private String episodioIdEpisodio;

    @Column(name = "visita_id_visita", nullable = false)
    private String visitaIdVisita;

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public Double getValorServicio() {
        return valorServicio;
    }

    public void setValorServicio(Double valorServicio) {
        this.valorServicio = valorServicio;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public Date getFechaCreacionServicio() {
        return fechaCreacionServicio;
    }

    public void setFechaCreacionServicio(Date fechaCreacionServicio) {
        this.fechaCreacionServicio = fechaCreacionServicio;
    }

    public Date getFechaBajaServicio() {
        return fechaBajaServicio;
    }

    public void setFechaBajaServicio(Date fechaBajaServicio) {
        this.fechaBajaServicio = fechaBajaServicio;
    }

    public String getEpisodioIdEpisodio() {
        return episodioIdEpisodio;
    }

    public void setEpisodioIdEpisodio(String episodioIdEpisodio) {
        this.episodioIdEpisodio = episodioIdEpisodio;
    }

    public String getVisitaIdVisita() {
        return visitaIdVisita;
    }

    public void setVisitaIdVisita(String visitaIdVisita) {
        this.visitaIdVisita = visitaIdVisita;
    }
}